// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.moguan_sdk20210415.models;

import com.aliyun.tea.*;

public class RegisterDeviceShrinkRequest extends TeaModel {
    @NameInMap("AppKey")
    public String appKey;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("Extend")
    public String extendShrink;

    @NameInMap("SdkCode")
    public String sdkCode;

    @NameInMap("UserDeviceId")
    public String userDeviceId;

    public static RegisterDeviceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RegisterDeviceShrinkRequest self = new RegisterDeviceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RegisterDeviceShrinkRequest setAppKey(String appKey) {
        this.appKey = appKey;
        return this;
    }
    public String getAppKey() {
        return this.appKey;
    }

    public RegisterDeviceShrinkRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public RegisterDeviceShrinkRequest setExtendShrink(String extendShrink) {
        this.extendShrink = extendShrink;
        return this;
    }
    public String getExtendShrink() {
        return this.extendShrink;
    }

    public RegisterDeviceShrinkRequest setSdkCode(String sdkCode) {
        this.sdkCode = sdkCode;
        return this;
    }
    public String getSdkCode() {
        return this.sdkCode;
    }

    public RegisterDeviceShrinkRequest setUserDeviceId(String userDeviceId) {
        this.userDeviceId = userDeviceId;
        return this;
    }
    public String getUserDeviceId() {
        return this.userDeviceId;
    }

}
