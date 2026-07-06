// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SignOutOrgAccountRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>企业安全合规要求，执行账号强制登出</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <strong>example:</strong>
     * <p>{&quot;zh_CN&quot;:&quot;管理员已执行登出&quot;,&quot;en_US&quot;:&quot;Signed out by admin&quot;}</p>
     */
    @NameInMap("ReasonI18nForEmployee")
    public java.util.Map<String, String> reasonI18nForEmployee;

    @NameInMap("TenantContext")
    public SignOutOrgAccountRequestTenantContext tenantContext;

    public static SignOutOrgAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        SignOutOrgAccountRequest self = new SignOutOrgAccountRequest();
        return TeaModel.build(map, self);
    }

    public SignOutOrgAccountRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SignOutOrgAccountRequest setReasonI18nForEmployee(java.util.Map<String, String> reasonI18nForEmployee) {
        this.reasonI18nForEmployee = reasonI18nForEmployee;
        return this;
    }
    public java.util.Map<String, String> getReasonI18nForEmployee() {
        return this.reasonI18nForEmployee;
    }

    public SignOutOrgAccountRequest setTenantContext(SignOutOrgAccountRequestTenantContext tenantContext) {
        this.tenantContext = tenantContext;
        return this;
    }
    public SignOutOrgAccountRequestTenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static class SignOutOrgAccountRequestTenantContext extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        public static SignOutOrgAccountRequestTenantContext build(java.util.Map<String, ?> map) throws Exception {
            SignOutOrgAccountRequestTenantContext self = new SignOutOrgAccountRequestTenantContext();
            return TeaModel.build(map, self);
        }

        public SignOutOrgAccountRequestTenantContext setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

    }

}
