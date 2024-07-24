// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckAlibabaStaffRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>156****9665</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("TenantContext")
    public CheckAlibabaStaffRequestTenantContext tenantContext;

    public static CheckAlibabaStaffRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAlibabaStaffRequest self = new CheckAlibabaStaffRequest();
        return TeaModel.build(map, self);
    }

    public CheckAlibabaStaffRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CheckAlibabaStaffRequest setTenantContext(CheckAlibabaStaffRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public CheckAlibabaStaffRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class CheckAlibabaStaffRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static CheckAlibabaStaffRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            CheckAlibabaStaffRequestTenantContext self = new CheckAlibabaStaffRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public CheckAlibabaStaffRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
