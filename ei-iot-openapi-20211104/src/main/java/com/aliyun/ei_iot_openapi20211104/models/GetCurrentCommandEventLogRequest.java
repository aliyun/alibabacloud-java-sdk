// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class GetCurrentCommandEventLogRequest extends TeaModel {
    // app验权信息
    @NameInMap("App")
    public App app;

    // 业务信息
    @NameInMap("BizRequest")
    public GetCurrentCommandEventLogRequestBizRequest bizRequest;

    // 租户信息
    @NameInMap("Tenant")
    public Tenant tenant;

    public static GetCurrentCommandEventLogRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCurrentCommandEventLogRequest self = new GetCurrentCommandEventLogRequest();
        return TeaModel.build(map, self);
    }

    public GetCurrentCommandEventLogRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public GetCurrentCommandEventLogRequest setBizRequest(GetCurrentCommandEventLogRequestBizRequest bizRequest) {
        this.bizRequest = bizRequest;
        return this;
    }
    public GetCurrentCommandEventLogRequestBizRequest getBizRequest() {
        return this.bizRequest;
    }

    public GetCurrentCommandEventLogRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class GetCurrentCommandEventLogRequestBizRequest extends TeaModel {
        // 设备code
        @NameInMap("DeviceCode")
        public String deviceCode;

        // 命令/事件类型
        @NameInMap("Type")
        public String type;

        public static GetCurrentCommandEventLogRequestBizRequest build(java.util.Map<String, ?> map) throws Exception {
            GetCurrentCommandEventLogRequestBizRequest self = new GetCurrentCommandEventLogRequestBizRequest();
            return TeaModel.build(map, self);
        }

        public GetCurrentCommandEventLogRequestBizRequest setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public GetCurrentCommandEventLogRequestBizRequest setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
