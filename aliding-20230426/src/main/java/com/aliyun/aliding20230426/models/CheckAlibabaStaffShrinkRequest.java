// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class CheckAlibabaStaffShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>156****9665</p>
     */
    @NameInMap("Mobile")
    public String mobile;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static CheckAlibabaStaffShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckAlibabaStaffShrinkRequest self = new CheckAlibabaStaffShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CheckAlibabaStaffShrinkRequest setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }
    public String getMobile() {
        return this.mobile;
    }

    public CheckAlibabaStaffShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
