// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class GetUserIdByOrgIdAndStaffIdShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("OrgId")
    public Long orgId;

    @NameInMap("TenantContext")
    public String tenantContextShrink;

    public static GetUserIdByOrgIdAndStaffIdShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        GetUserIdByOrgIdAndStaffIdShrinkRequest self = new GetUserIdByOrgIdAndStaffIdShrinkRequest();
        return TeaModel.build(map, self);
    }

    public GetUserIdByOrgIdAndStaffIdShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public GetUserIdByOrgIdAndStaffIdShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

}
