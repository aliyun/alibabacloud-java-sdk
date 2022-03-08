// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class GetTemplatePropertyValueByCodeRequest extends TeaModel {
    // app验权信息
    @NameInMap("App")
    public App app;

    // 设备编码
    @NameInMap("DeviceCode")
    public String deviceCode;

    // 租户信息
    @NameInMap("Tenant")
    public Tenant tenant;

    public static GetTemplatePropertyValueByCodeRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTemplatePropertyValueByCodeRequest self = new GetTemplatePropertyValueByCodeRequest();
        return TeaModel.build(map, self);
    }

    public GetTemplatePropertyValueByCodeRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public GetTemplatePropertyValueByCodeRequest setDeviceCode(String deviceCode) {
        this.deviceCode = deviceCode;
        return this;
    }
    public String getDeviceCode() {
        return this.deviceCode;
    }

    public GetTemplatePropertyValueByCodeRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

}
