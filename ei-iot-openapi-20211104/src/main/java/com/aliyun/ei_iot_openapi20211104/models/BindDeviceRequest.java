// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ei_iot_openapi20211104.models;

import com.aliyun.tea.*;

public class BindDeviceRequest extends TeaModel {
    @NameInMap("App")
    public App app;

    @NameInMap("BizRequest")
    public BindDeviceRequestBizRequest bizRequest;

    @NameInMap("Tenant")
    public Tenant tenant;

    public static BindDeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        BindDeviceRequest self = new BindDeviceRequest();
        return TeaModel.build(map, self);
    }

    public BindDeviceRequest setApp(App app) {
        this.app = app;
        return this;
    }
    public App getApp() {
        return this.app;
    }

    public BindDeviceRequest setBizRequest(BindDeviceRequestBizRequest bizRequest) {
        this.bizRequest = bizRequest;
        return this;
    }
    public BindDeviceRequestBizRequest getBizRequest() {
        return this.bizRequest;
    }

    public BindDeviceRequest setTenant(Tenant tenant) {
        this.tenant = tenant;
        return this;
    }
    public Tenant getTenant() {
        return this.tenant;
    }

    public static class BindDeviceRequestBizRequest extends TeaModel {
        @NameInMap("DeviceCode")
        public String deviceCode;

        @NameInMap("SpaceUnitId")
        public Long spaceUnitId;

        public static BindDeviceRequestBizRequest build(java.util.Map<String, ?> map) throws Exception {
            BindDeviceRequestBizRequest self = new BindDeviceRequestBizRequest();
            return TeaModel.build(map, self);
        }

        public BindDeviceRequestBizRequest setDeviceCode(String deviceCode) {
            this.deviceCode = deviceCode;
            return this;
        }
        public String getDeviceCode() {
            return this.deviceCode;
        }

        public BindDeviceRequestBizRequest setSpaceUnitId(Long spaceUnitId) {
            this.spaceUnitId = spaceUnitId;
            return this;
        }
        public Long getSpaceUnitId() {
            return this.spaceUnitId;
        }

    }

}
