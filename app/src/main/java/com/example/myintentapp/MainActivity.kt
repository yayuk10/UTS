package com.example.myintentapp

import android.content.Intent
import android.net.Uri
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_move_activity.setOnClickListener{
            val intent = Intent(this,MoveActivity::class.java)
            startActivity(intent)
        }
        btn_move_activity_data.setOnClickListener{
            startActivity(Intent(this, MoveWithDataActivity::class.java))
        }
        btn_dial_number.setOnClickListener {
            val intent = Intent(this,MoveExActivity::class.java)
            startActivity(intent)
        }

    }
}