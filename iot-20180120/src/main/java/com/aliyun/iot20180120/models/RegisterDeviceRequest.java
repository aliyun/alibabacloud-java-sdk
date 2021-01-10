// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    @NameInMap("ApiProduct")
    public String apiProduct;

    @NameInMap("ApiRevision")
    public String apiRevision;

    @NameInMap("IotInstanceId")
    public String iotInstanceId;

    @NameInMap("ProductKey")
    public String productKey;

    @NameInMap("DeviceName")
    public String deviceName;

    @NameInMap("DevEui")
    public String devEui;

    @NameInMap("Nickname")
    public String nickname;

    @NameInMap("PinCode")
    public String pinCode;

    @NameInMap("JoinEui")
    public String joinEui;

    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("LoraNodeType")
    public String loraNodeType;

    @NameInMap("RealTenantId")
    public String realTenantId;

    @NameInMap("RealTripartiteKey")
    public String realTripartiteKey;

    public static RegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceRequest self = new RegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceRequest setApiProduct(String apiProduct) {
        this.apiProduct = apiProduct;
        return this;
    }
    public String getApiProduct() {
        return this.apiProduct;
    }

    public RegisterDeviceRequest setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }
    public String getApiRevision() {
        return this.apiRevision;
    }

    public RegisterDeviceRequest setIotInstanceId(String iotInstanceId) {
        this.iotInstanceId = iotInstanceId;
        return this;
    }
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    public RegisterDeviceRequest setProductKey(String productKey) {
        this.productKey = productKey;
        return this;
    }
    public String getProductKey() {
        return this.productKey;
    }

    public RegisterDeviceRequest setDeviceName(String deviceName) {
        this.deviceName = deviceName;
        return this;
    }
    public String getDeviceName() {
        return this.deviceName;
    }

    public RegisterDeviceRequest setDevEui(String devEui) {
        this.devEui = devEui;
        return this;
    }
    public String getDevEui() {
        return this.devEui;
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

    public RegisterDeviceRequest setJoinEui(String joinEui) {
        this.joinEui = joinEui;
        return this;
    }
    public String getJoinEui() {
        return this.joinEui;
    }

    public RegisterDeviceRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RegisterDeviceRequest setLoraNodeType(String loraNodeType) {
        this.loraNodeType = loraNodeType;
        return this;
    }
    public String getLoraNodeType() {
        return this.loraNodeType;
    }

    public RegisterDeviceRequest setRealTenantId(String realTenantId) {
        this.realTenantId = realTenantId;
        return this;
    }
    public String getRealTenantId() {
        return this.realTenantId;
    }

    public RegisterDeviceRequest setRealTripartiteKey(String realTripartiteKey) {
        this.realTripartiteKey = realTripartiteKey;
        return this;
    }
    public String getRealTripartiteKey() {
        return this.realTripartiteKey;
    }

}
