// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class UnRegisterDeviceRequest extends TeaModel {
    @NameInMap("App")
    public App app;

    @NameInMap("DeviceCode")
    public String deviceCode;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("OuterDeviceId")
    public String outerDeviceId;

    public static UnRegisterDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnRegisterDeviceRequest self = new UnRegisterDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnRegisterDeviceRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public UnRegisterDeviceRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public UnRegisterDeviceRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public UnRegisterDeviceRequest setOuterDeviceId(String outerDeviceId) {
        this.outerDeviceId = outerDeviceId;
        return this;
    }
    public String getOuterDeviceId() {
        return this.outerDeviceId;
    }

}
