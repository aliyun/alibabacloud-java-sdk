// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("DevEui")
    public String devEui;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("JoinEui")
    public String joinEui;

    @NameInMap("LoraNodeType")
    public String loraNodeType;

    @NameInMap("Nickname")
    public String nickname;

    @NameInMap("PinCode")
    public String pinCode;

    @NameInMap("ProductKey")
    public String productKey;

    public static RegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceRequest self = new RegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RegisterDeviceRequest setDevEui(String devEui) {
        this.devEui = devEui;
        return this;
    }
    public String getDevEui() {
        return this.devEui;
    }

    public RegisterDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegisterDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RegisterDeviceRequest setJoinEui(String joinEui) {
        this.joinEui = joinEui;
        return this;
    }
    public String getJoinEui() {
        return this.joinEui;
    }

    public RegisterDeviceRequest setLoraNodeType(String loraNodeType) {
        this.loraNodeType = loraNodeType;
        return this;
    }
    public String getLoraNodeType() {
        return this.loraNodeType;
    }

    public RegisterDeviceRequest setNickname(String nickname) {
        this.nickname = nickname;
        return this;
    }
    public String getNickname() {
        return this.nickname;
    }

    public RegisterDeviceRequest setPinCode(String pinCode) {
        this.pinCode = pinCode;
        return this;
    }
    public String getPinCode() {
        return this.pinCode;
    }

    public RegisterDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

}
