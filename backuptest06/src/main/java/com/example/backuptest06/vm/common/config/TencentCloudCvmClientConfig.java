package com.example.backuptest06.vm.common.config;

import com.tencentcloudapi.common.Credential;
import com.tencentcloudapi.common.profile.ClientProfile;
import com.tencentcloudapi.common.profile.HttpProfile;
import com.tencentcloudapi.cvm.v20170312.CvmClient;

/**
 * @author
 * @Description  腾讯云CVM主机连接配置
 * @time 2022093016:28
 */
public class TencentCloudCvmClientConfig {
    private static String endPoint="cvm.tencentcloudapi.com";
    private static String secretId = "";
    private static String secretKey = "";
    public static CvmClient createClient(){
        // 实例化一个认证对象，入参需要传入腾讯云账户secretId，secretKey,此处还需注意密钥对的保密
        Credential cred = new Credential(secretId,secretKey);
        // 实例化一个http选项，可选的，没有特殊需求可以跳过
        HttpProfile httpProfile = new HttpProfile();
        httpProfile.setEndpoint(endPoint);
        // 实例化一个client选项
        ClientProfile clientProfile = new ClientProfile();
        clientProfile.setHttpProfile(httpProfile);
        // 实例化要请求产品的client对象,clientProfile是可选的
        CvmClient client = new CvmClient(cred, "", clientProfile);
        return client;
    }

}
