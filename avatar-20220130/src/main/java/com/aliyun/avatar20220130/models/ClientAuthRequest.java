// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientAuthRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("DeviceInfo")
    public String deviceInfo;

    @NameInMap("DeviceType")
    public String deviceType;

    @NameInMap("License")
    public String license;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ClientAuthRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientAuthRequest self = new ClientAuthRequest();
        return TeaModel.build(map, self);
    }

    public ClientAuthRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public ClientAuthRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ClientAuthRequest setDeviceInfo(String deviceInfo) {
        this.deviceInfo = deviceInfo;
        return this;
    }
    public String getDeviceInfo() {
        return this.deviceInfo;
    }

    public ClientAuthRequest setDeviceType(String deviceType) {
        this.deviceType = deviceType;
        return this;
    }
    public String getDeviceType() {
        return this.deviceType;
    }

    public ClientAuthRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public ClientAuthRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
