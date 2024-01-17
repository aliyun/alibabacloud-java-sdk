// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.avatar20220130.models;

import com.aliyun.tea.*;

public class ClientUnbindDeviceRequest extends TeaModel {
    @NameInMap("DeviceId")
    public String deviceId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static ClientUnbindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        ClientUnbindDeviceRequest self = new ClientUnbindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public ClientUnbindDeviceRequest setDeviceId(String deviceId) {
        this.deviceId = deviceId;
        return this;
    }
    public String getDeviceId() {
        return this.deviceId;
    }

    public ClientUnbindDeviceRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
