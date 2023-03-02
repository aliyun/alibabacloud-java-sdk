// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.moguan_sdk20210415.models;

import com.aliyun.tea.*;

public class RegisterDeviceRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Extend")
    public java.util.Map<String, ?> extend;

    @NameInMap("SdkCode")
    public String sdkCode;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

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

    public RegisterDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegisterDeviceRequest setExtend(java.util.Map<String, ?> extend) {
        this.extend = extend;
        return this;
    }
    public java.util.Map<String, ?> getExtend() {
        return this.extend;
    }

    public RegisterDeviceRequest setSdkCode(String sdkCode) {
        this.sdkCode = sdkCode;
        return this;
    }
    public String getSdkCode() {
        return this.sdkCode;
    }

    public RegisterDeviceRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
