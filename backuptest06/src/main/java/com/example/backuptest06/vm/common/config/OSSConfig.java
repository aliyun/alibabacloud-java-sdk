package com.example.backuptest06.vm.common.config;

import java.io.IOException;
/**
 * @author
 * @Description
 * @time 2022101414:49
 */
    public class OSSConfig{
        private  String endpoint;       //连接区域地址
        private  String accessKeyId;    //连接keyId
        private  String accessKeySecret;    //连接秘钥
        private  String bucketName;     //需要存储的bucketName
        private  String picLocation;    //图片保存路径

        /*
         * 加载配置文件 初始化 参数
         * 也可 yml加载
         * */


        public OSSConfig() {
            try {
                this.endpoint = SystemConfig.getConfigResource("endpoint");
                this.bucketName = SystemConfig.getConfigResource("bucketName");
                this.picLocation = SystemConfig.getConfigResource("picLocation");
                this.accessKeyId = SystemConfig.getConfigResource("accessKeyId");
                this.accessKeySecret = SystemConfig.getConfigResource("accessKeySecret");

                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());
                System.out.println(toString());

            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public String getEndpoint() {
            return endpoint;
        }
        public void setEndpoint(String endpoint) {
            this.endpoint = endpoint;
        }
        public String getAccessKeyId() {
            return accessKeyId;
        }
        public void setAccessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
        }
        public String getAccessKeySecret() {
            return accessKeySecret;
        }
        public void setAccessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
        }
        public String getBucketName() {
            return bucketName;
        }
        public void setBucketName(String bucketName) {
            this.bucketName = bucketName;
        }
        public String getPicLocation() {
            return picLocation;
        }
        public void setPicLocation(String picLocation) {
            this.picLocation = picLocation;
        }

        @Override
        public String toString() {
            return "OSSConfig{" +
                    "endpoint='" + endpoint + '\'' +
                    ", accessKeyId='" + accessKeyId + '\'' +
                    ", accessKeySecret='" + accessKeySecret + '\'' +
                    ", bucketName='" + bucketName + '\'' +
                    ", picLocation='" + picLocation + '\'' +
                    '}';
        }
    }

