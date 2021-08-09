// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class OpenSpringCloudFlowItemRulesRequest extends TeaModel {
    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // ItemRule的ID
    @NameInMap("ruleItemIds")
    public java.util.List<String> ruleItemIds;

    public static OpenSpringCloudFlowItemRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenSpringCloudFlowItemRulesRequest self = new OpenSpringCloudFlowItemRulesRequest();
        return TeaModel.build(map, self);
    }

    public OpenSpringCloudFlowItemRulesRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public OpenSpringCloudFlowItemRulesRequest setRuleItemIds(java.util.List<String> ruleItemIds) {
        this.ruleItemIds = ruleItemIds;
        return this;
    }
    public java.util.List<String> getRuleItemIds() {
        return this.ruleItemIds;
    }

}
