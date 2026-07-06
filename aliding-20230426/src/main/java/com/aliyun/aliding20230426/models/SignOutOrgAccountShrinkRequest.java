// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SignOutOrgAccountShrinkRequest extends TeaModel {
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
    public String reasonI18nForEmployeeShrink;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static SignOutOrgAccountShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SignOutOrgAccountShrinkRequest self = new SignOutOrgAccountShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SignOutOrgAccountShrinkRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public SignOutOrgAccountShrinkRequest setReasonI18nForEmployeeShrink(String reasonI18nForEmployeeShrink) {
        this.reasonI18nForEmployeeShrink = reasonI18nForEmployeeShrink;
        return this;
    }
    public String getReasonI18nForEmployeeShrink() {
        return this.reasonI18nForEmployeeShrink;
    }

    public SignOutOrgAccountShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
