// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class CreateRtmpDeviceRequest extends TeaModel {
    @NameInMap("Description")
    public String description;

    @NameInMap("DeviceName")
    public String deviceName;

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

    @NameInMap("SubStreamName")
    public String subStreamName;

    public static CreateRtmpDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateRtmpDeviceRequest self = new CreateRtmpDeviceRequest();
        return TeaModel.build(map, self);
    }

    public CreateRtmpDeviceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateRtmpDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public CreateRtmpDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public CreateRtmpDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public CreateRtmpDeviceRequest setPullAuthKey(String pullAuthKey) {
        this.pullAuthKey = pullAuthKey;
        return this;
    }
    public String getPullAuthKey() {
        return this.pullAuthKey;
    }

    public CreateRtmpDeviceRequest setPullKeyExpireTime(Integer pullKeyExpireTime) {
        this.pullKeyExpireTime = pullKeyExpireTime;
        return this;
    }
    public Integer getPullKeyExpireTime() {
        return this.pullKeyExpireTime;
    }

    public CreateRtmpDeviceRequest setPushAuthKey(String pushAuthKey) {
        this.pushAuthKey = pushAuthKey;
        return this;
    }
    public String getPushAuthKey() {
        return this.pushAuthKey;
    }

    public CreateRtmpDeviceRequest setPushKeyExpireTime(Integer pushKeyExpireTime) {
        this.pushKeyExpireTime = pushKeyExpireTime;
        return this;
    }
    public Integer getPushKeyExpireTime() {
        return this.pushKeyExpireTime;
    }

    public CreateRtmpDeviceRequest setSubStreamName(String subStreamName) {
        this.subStreamName = subStreamName;
        return this;
    }
    public String getSubStreamName() {
        return this.subStreamName;
    }

}
