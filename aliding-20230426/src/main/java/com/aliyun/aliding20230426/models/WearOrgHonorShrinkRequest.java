// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class WearOrgHonorShrinkRequest extends TeaModel {
    @NameInMap("TenantContext")
    public String tenantContextShrink;

    @NameInMap("honorId")
    public String honorId;

    @NameInMap("orgId")
    public Long orgId;

    @NameInMap("userId")
    public String userId;

    @NameInMap("wear")
    public Boolean wear;

    public static WearOrgHonorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        WearOrgHonorShrinkRequest self = new WearOrgHonorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public WearOrgHonorShrinkRequest setTenantContextShrink(String tenantContextShrink) {
        this.tenantContextShrink = tenantContextShrink;
        return this;
    }
    public String getTenantContextShrink() {
        return this.tenantContextShrink;
    }

    public WearOrgHonorShrinkRequest setHonorId(String honorId) {
        this.honorId = honorId;
        return this;
    }
    public String getHonorId() {
        return this.honorId;
    }

    public WearOrgHonorShrinkRequest setOrgId(Long orgId) {
        this.orgId = orgId;
        return this;
    }
    public Long getOrgId() {
        return this.orgId;
    }

    public WearOrgHonorShrinkRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public WearOrgHonorShrinkRequest setWear(Boolean wear) {
        this.wear = wear;
        return this;
    }
    public Boolean getWear() {
        return this.wear;
    }

}
