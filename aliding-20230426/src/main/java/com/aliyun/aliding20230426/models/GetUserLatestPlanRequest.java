// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserLatestPlanRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetUserLatestPlanRequestTenantContext tenantContext;

    public static GetUserLatestPlanRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserLatestPlanRequest self = new GetUserLatestPlanRequest();
        return TeaModel.build(map, self);
    }

    public GetUserLatestPlanRequest setTenantContext(GetUserLatestPlanRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetUserLatestPlanRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetUserLatestPlanRequestTenantContext extends TeaModel {
        @NameInMap("tenantId")
        public String tenantId;

        public static GetUserLatestPlanRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserLatestPlanRequestTenantContext self = new GetUserLatestPlanRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetUserLatestPlanRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
