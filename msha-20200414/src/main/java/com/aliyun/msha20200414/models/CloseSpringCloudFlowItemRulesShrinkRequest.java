// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class CloseSpringCloudFlowItemRulesShrinkRequest extends TeaModel {
    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // ItemRule的ID
    @NameInMap("ruleItemIds")
    public String ruleItemIdsShrink;

    public static CloseSpringCloudFlowItemRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CloseSpringCloudFlowItemRulesShrinkRequest self = new CloseSpringCloudFlowItemRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CloseSpringCloudFlowItemRulesShrinkRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public CloseSpringCloudFlowItemRulesShrinkRequest setRuleItemIdsShrink(String ruleItemIdsShrink) {
        this.ruleItemIdsShrink = ruleItemIdsShrink;
        return this;
    }
    public String getRuleItemIdsShrink() {
        return this.ruleItemIdsShrink;
    }

}
