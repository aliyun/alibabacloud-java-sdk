// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class UpdateRtmpKeyRequest extends TeaModel {
    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotId")
    public String iotId;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("PullAuthKey")
    public String pullAuthKey;

    @NameInMap("PullKeyExpireTime")
    public Integer pullKeyExpireTime;

    @NameInMap("PushAuthKey")
    public String pushAuthKey;

    @NameInMap("PushKeyExpireTime")
    public Integer pushKeyExpireTime;

    public static UpdateRtmpKeyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtmpKeyRequest self = new UpdateRtmpKeyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtmpKeyRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public UpdateRtmpKeyRequest setIotId(String iotId) {
        this.iotId = iotId;
        return this;
    }
    public String getIotId() {
        return this.iotId;
    }

    public UpdateRtmpKeyRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public UpdateRtmpKeyRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public UpdateRtmpKeyRequest setPullAuthKey(String pullAuthKey) {
        this.pullAuthKey = pullAuthKey;
        return this;
    }
    public String getPullAuthKey() {
        return this.pullAuthKey;
    }

    public UpdateRtmpKeyRequest setPullKeyExpireTime(Integer pullKeyExpireTime) {
        this.pullKeyExpireTime = pullKeyExpireTime;
        return this;
    }
    public Integer getPullKeyExpireTime() {
        return this.pullKeyExpireTime;
    }

    public UpdateRtmpKeyRequest setPushAuthKey(String pushAuthKey) {
        this.pushAuthKey = pushAuthKey;
        return this;
    }
    public String getPushAuthKey() {
        return this.pushAuthKey;
    }

    public UpdateRtmpKeyRequest setPushKeyExpireTime(Integer pushKeyExpireTime) {
        this.pushKeyExpireTime = pushKeyExpireTime;
        return this;
    }
    public Integer getPushKeyExpireTime() {
        return this.pushKeyExpireTime;
    }

}
