// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class UpdateDeviceRequest extends TeaModel {
    // App校验信息
    @NameInMap("App")
    public App app;

    // 设备更新信息
    @NameInMap("DeviceUpdateRequest")
    public UpdateDeviceRequestDeviceUpdateRequest deviceUpdateRequest;

    // 租户信息
    @NameInMap("Tenant")
    public Tenant tenant;

    public static UpdateDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateDeviceRequest self = new UpdateDeviceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateDeviceRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public UpdateDeviceRequest setDeviceUpdateRequest(UpdateDeviceRequestDeviceUpdateRequest deviceUpdateRequest) {
        this.deviceUpdateRequest = deviceUpdateRequest;
        return this;
    }
    public UpdateDeviceRequestDeviceUpdateRequest getDeviceUpdateRequest() {
        return this.deviceUpdateRequest;
    }

    public UpdateDeviceRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class UpdateDeviceRequestDeviceUpdateRequest extends TeaModel {
        // 激活状态 int 1表示激活0表示失活
        @NameInMap("ActiveStatus")
        public String activeStatus;

        // 应用版本号
        @NameInMap("AppVersion")
        public String appVersion;

        // 设备编码
        @NameInMap("DeviceCode")
        public String deviceCode;

        // 设备IP
        @NameInMap("DeviceIp")
        public String deviceIp;

        // 设备名称
        @NameInMap("DeviceName")
        public String deviceName;

        // 设备拥有者
        @NameInMap("OwnerId")
        public String ownerId;

        // rom版本号
        @NameInMap("RomVersion")
        public String romVersion;

        public static UpdateDeviceRequestDeviceUpdateRequest build(java.util.Map<String, ?> map) throws Exception {
            UpdateDeviceRequestDeviceUpdateRequest self = new UpdateDeviceRequestDeviceUpdateRequest();
            return TeaModel.build(map, self);
        }

        public UpdateDeviceRequestDeviceUpdateRequest setActiveStatus(String activeStatus) {
            this.activeStatus = activeStatus;
            return this;
        }
        public String getActiveStatus() {
            return this.activeStatus;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setAppVersion(String appVersion) {
            this.appVersion = appVersion;
            return this;
        }
        public String getAppVersion() {
            return this.appVersion;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setDeviceIp(String deviceIp) {
            this.deviceIp = deviceIp;
            return this;
        }
        public String getDeviceIp() {
            return this.deviceIp;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setDeviceName(String deviceName) {
            this.deviceName = deviceName;
            return this;
        }
        public String getDeviceName() {
            return this.deviceName;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public UpdateDeviceRequestDeviceUpdateRequest setRomVersion(String romVersion) {
            this.romVersion = romVersion;
            return this;
        }
        public String getRomVersion() {
            return this.romVersion;
        }

    }

}
