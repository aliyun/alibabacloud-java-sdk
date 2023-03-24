package com.example.backuptest06.vm.common.config;

import com.aliyun.oss.OSS;
import com.aliyun.oss.OSSClientBuilder;


/**
 * 阿里云OSS对象存储连接配置
 *
 * @author 
 * @version 2
 *
 * @since 2
 */
public class AliyunOssClientConfig {

    /**
     * 初始化阿里云OSS账号Client
     * @param accessKeyId 用户AccessKey ID
     * @param accessKeySecret 用户AccessKey Secret
     * @param endPoint 访问的域名
     * @return OSS
     * @since 2
     */
    private static String accessKeyId="LTAI5tN9xxxxxxx";
    private static String accessKeySecret="4o88kaOkDjxxxxxxxx";
    private static String endPoint="https://oss-cn-beijing.aliyuncs.com";
    public static OSS createClient(){
        // 创建OSSClient实例。
        OSS ossClient = new OSSClientBuilder().build(endPoint, accessKeyId, accessKeySecret);

        return ossClient;
    }
}
