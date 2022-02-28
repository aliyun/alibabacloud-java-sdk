// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hdr20170925.models;

import com.aliyun.tea.*;

public class ActivateDrGatewayResponseBody extends TeaModel {
    @NameInMap("AccountId")
    public Long accountId;

    @NameInMap("BucketName")
    public String bucketName;

    @NameInMap("Code")
    public String code;

    @NameInMap("GatewayId")
    public String gatewayId;

    @NameInMap("Message")
    public String message;

    @NameInMap("MqttBroker")
    public String mqttBroker;

    @NameInMap("ProtectedServerQuota")
    public Integer protectedServerQuota;

    @NameInMap("PubToken")
    public String pubToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SubToken")
    public String subToken;

    @NameInMap("Success")
    public Boolean success;

    public static ActivateDrGatewayResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ActivateDrGatewayResponseBody self = new ActivateDrGatewayResponseBody();
        return TeaModel.build(map, self);
    }

    public ActivateDrGatewayResponseBody setAccountId(Long accountId) {
        this.accountId = accountId;
        return this;
    }
    public Long getAccountId() {
        return this.accountId;
    }

    public ActivateDrGatewayResponseBody setBucketName(String bucketName) {
        this.bucketName = bucketName;
        return this;
    }
    public String getBucketName() {
        return this.bucketName;
    }

    public ActivateDrGatewayResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ActivateDrGatewayResponseBody setGatewayId(String gatewayId) {
        this.gatewayId = gatewayId;
        return this;
    }
    public String getGatewayId() {
        return this.gatewayId;
    }

    public ActivateDrGatewayResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ActivateDrGatewayResponseBody setMqttBroker(String mqttBroker) {
        this.mqttBroker = mqttBroker;
        return this;
    }
    public String getMqttBroker() {
        return this.mqttBroker;
    }

    public ActivateDrGatewayResponseBody setProtectedServerQuota(Integer protectedServerQuota) {
        this.protectedServerQuota = protectedServerQuota;
        return this;
    }
    public Integer getProtectedServerQuota() {
        return this.protectedServerQuota;
    }

    public ActivateDrGatewayResponseBody setPubToken(String pubToken) {
        this.pubToken = pubToken;
        return this;
    }
    public String getPubToken() {
        return this.pubToken;
    }

    public ActivateDrGatewayResponseBody setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ActivateDrGatewayResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ActivateDrGatewayResponseBody setSubToken(String subToken) {
        this.subToken = subToken;
        return this;
    }
    public String getSubToken() {
        return this.subToken;
    }

    public ActivateDrGatewayResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
