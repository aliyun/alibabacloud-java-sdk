// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class UpdateSpringCloudItemRulePriorityRequest extends TeaModel {
    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 是否立即生效
    @NameInMap("Effective")
    public Boolean effective;

    @NameInMap("Priorities")
    public java.util.Map<String, ?> priorities;

    public static UpdateSpringCloudItemRulePriorityRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSpringCloudItemRulePriorityRequest self = new UpdateSpringCloudItemRulePriorityRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSpringCloudItemRulePriorityRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public UpdateSpringCloudItemRulePriorityRequest setEffective(Boolean effective) {
        this.effective = effective;
        return this;
    }
    public Boolean getEffective() {
        return this.effective;
    }

    public UpdateSpringCloudItemRulePriorityRequest setPriorities(java.util.Map<String, ?> priorities) {
        this.priorities = priorities;
        return this;
    }
    public java.util.Map<String, ?> getPriorities() {
        return this.priorities;
    }

}
