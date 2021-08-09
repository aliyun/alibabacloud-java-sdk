// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudItemRulePriorityShrinkRequest extends TeaModel {
    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 是否立即生效
    @NameInMap("Effective")
    public Boolean effective;

    @NameInMap("Priorities")
    public String prioritiesShrink;

    public static UpdateSpringCloudItemRulePriorityShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudItemRulePriorityShrinkRequest self = new UpdateSpringCloudItemRulePriorityShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudItemRulePriorityShrinkRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public UpdateSpringCloudItemRulePriorityShrinkRequest setEffective(Boolean effective) {
        this.effective = effective;
        return this;
    }
    public Boolean getEffective() {
        return this.effective;
    }

    public UpdateSpringCloudItemRulePriorityShrinkRequest setPrioritiesShrink(String prioritiesShrink) {
        this.prioritiesShrink = prioritiesShrink;
        return this;
    }
    public String getPrioritiesShrink() {
        return this.prioritiesShrink;
    }

}
