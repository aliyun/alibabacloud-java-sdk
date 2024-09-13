// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOrgIdAndStaffIdRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OrgId")
    public Long orgId;

    @NameInMap("TenantContext")
    public GetUserIdByOrgIdAndStaffIdRequestTenantContext tenantContext;

    public static GetUserIdByOrgIdAndStaffIdRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOrgIdAndStaffIdRequest self = new GetUserIdByOrgIdAndStaffIdRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOrgIdAndStaffIdRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GetUserIdByOrgIdAndStaffIdRequest setTenantContext(GetUserIdByOrgIdAndStaffIdRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetUserIdByOrgIdAndStaffIdRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class GetUserIdByOrgIdAndStaffIdRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetUserIdByOrgIdAndStaffIdRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetUserIdByOrgIdAndStaffIdRequestTenantContext self = new GetUserIdByOrgIdAndStaffIdRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetUserIdByOrgIdAndStaffIdRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
