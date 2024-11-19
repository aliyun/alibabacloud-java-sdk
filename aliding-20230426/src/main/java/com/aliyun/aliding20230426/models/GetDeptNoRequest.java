// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetDeptNoRequest extends TeaModel {
    @NameInMap("TenantContext")
    public GetDeptNoRequestTenantContext tenantContext;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>012345</p>
     */
    @NameInMap("deptId")
    public String deptId;

    public static GetDeptNoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDeptNoRequest self = new GetDeptNoRequest();
        return TeaModel.build(map, self);
    }

    public GetDeptNoRequest setTenantContext(GetDeptNoRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public GetDeptNoRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public GetDeptNoRequest setDeptId(String deptId) {
        this.deptId = deptId;
        return this;
    }
    public String getDeptId() {
        return this.deptId;
    }

    public static class GetDeptNoRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static GetDeptNoRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            GetDeptNoRequestTenantContext self = new GetDeptNoRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public GetDeptNoRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
