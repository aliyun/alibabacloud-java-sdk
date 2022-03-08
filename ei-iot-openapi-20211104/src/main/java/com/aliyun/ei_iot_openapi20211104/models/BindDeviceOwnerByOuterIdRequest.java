// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class BindDeviceOwnerByOuterIdRequest extends TeaModel {
    // App验权信息
    @NameInMap("App")
    public App app;

    // 设备型号
    @NameInMap("DeviceModel")
    public String deviceModel;

    // 设备外部ID
    @NameInMap("OuterDeviceId")
    public String outerDeviceId;

    // 设备ownerId
    @NameInMap("OwnerId")
    public String ownerId;

    public static BindDeviceOwnerByOuterIdRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDeviceOwnerByOuterIdRequest self = new BindDeviceOwnerByOuterIdRequest();
        return TeaModel.build(map, self);
    }

    public BindDeviceOwnerByOuterIdRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public BindDeviceOwnerByOuterIdRequest setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
        return this;
    }
    public String getDeviceModel() {
        return this.deviceModel;
    }

    public BindDeviceOwnerByOuterIdRequest setOuterDeviceId(String outerDeviceId) {
        this.outerDeviceId = outerDeviceId;
        return this;
    }
    public String getOuterDeviceId() {
        return this.outerDeviceId;
    }

    public BindDeviceOwnerByOuterIdRequest setOwnerId(String ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public String getOwnerId() {
        return this.ownerId;
    }

}
