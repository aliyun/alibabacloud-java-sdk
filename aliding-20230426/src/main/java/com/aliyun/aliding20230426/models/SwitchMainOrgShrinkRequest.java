// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class SwitchMainOrgShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>21001</p>
     */
    @NameInMap("TargetOrgId")
    public Long targetOrgId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static SwitchMainOrgShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchMainOrgShrinkRequest self = new SwitchMainOrgShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SwitchMainOrgShrinkRequest setTargetOrgId(Long targetOrgId) {
        this.targetOrgId = targetOrgId;
        return this;
    }
    public Long getTargetOrgId() {
        return this.targetOrgId;
    }

    public SwitchMainOrgShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
