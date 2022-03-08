// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class SyncDevicePropertyRequest extends TeaModel {
    // app验权信息
    @NameInMap("App")
    public App app;

    @NameInMap("DeviceDataPushRequest")
    public SyncDevicePropertyRequestDeviceDataPushRequest deviceDataPushRequest;

    // 租户信息
    @NameInMap("Tenant")
    public Tenant tenant;

    public static SyncDevicePropertyRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncDevicePropertyRequest self = new SyncDevicePropertyRequest();
        return TeaModel.build(map, self);
    }

    public SyncDevicePropertyRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public SyncDevicePropertyRequest setDeviceDataPushRequest(SyncDevicePropertyRequestDeviceDataPushRequest deviceDataPushRequest) {
        this.deviceDataPushRequest = deviceDataPushRequest;
        return this;
    }
    public SyncDevicePropertyRequestDeviceDataPushRequest getDeviceDataPushRequest() {
        return this.deviceDataPushRequest;
    }

    public SyncDevicePropertyRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class SyncDevicePropertyRequestDeviceDataPushRequest extends TeaModel {
        // 设备编码
        @NameInMap("DeviceCode")
        public String deviceCode;

        // 设备模板中设备自定义属性值
        @NameInMap("DevicePropertyMap")
        public java.util.Map<String, ?> devicePropertyMap;

        // 设备模板中设备预定义扩展属性值
        @NameInMap("PredefinePropertyMap")
        public java.util.Map<String, ?> predefinePropertyMap;

        // 设备协议中的设备协议属性值
        @NameInMap("ProtocolPropertyMap")
        public java.util.Map<String, ?> protocolPropertyMap;

        public static SyncDevicePropertyRequestDeviceDataPushRequest build(java.util.Map<String, ?> map) throws Exception {
            SyncDevicePropertyRequestDeviceDataPushRequest self = new SyncDevicePropertyRequestDeviceDataPushRequest();
            return TeaModel.build(map, self);
        }

        public SyncDevicePropertyRequestDeviceDataPushRequest setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public SyncDevicePropertyRequestDeviceDataPushRequest setDevicePropertyMap(java.util.Map<String, ?> devicePropertyMap) {
            this.devicePropertyMap = devicePropertyMap;
            return this;
        }
        public java.util.Map<String, ?> getDevicePropertyMap() {
            return this.devicePropertyMap;
        }

        public SyncDevicePropertyRequestDeviceDataPushRequest setPredefinePropertyMap(java.util.Map<String, ?> predefinePropertyMap) {
            this.predefinePropertyMap = predefinePropertyMap;
            return this;
        }
        public java.util.Map<String, ?> getPredefinePropertyMap() {
            return this.predefinePropertyMap;
        }

        public SyncDevicePropertyRequestDeviceDataPushRequest setProtocolPropertyMap(java.util.Map<String, ?> protocolPropertyMap) {
            this.protocolPropertyMap = protocolPropertyMap;
            return this;
        }
        public java.util.Map<String, ?> getProtocolPropertyMap() {
            return this.protocolPropertyMap;
        }

    }

}
