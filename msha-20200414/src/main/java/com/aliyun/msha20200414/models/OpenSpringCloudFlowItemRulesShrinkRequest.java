// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class OpenSpringCloudFlowItemRulesShrinkRequest extends TeaModel {
    // 多活命名空间
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // ItemRule的ID
    @NameInMap("ruleItemIds")
    public String ruleItemIdsShrink;

    public static OpenSpringCloudFlowItemRulesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        OpenSpringCloudFlowItemRulesShrinkRequest self = new OpenSpringCloudFlowItemRulesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public OpenSpringCloudFlowItemRulesShrinkRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public OpenSpringCloudFlowItemRulesShrinkRequest setRuleItemIdsShrink(String ruleItemIdsShrink) {
        this.ruleItemIdsShrink = ruleItemIdsShrink;
        return this;
    }
    public String getRuleItemIdsShrink() {
        return this.ruleItemIdsShrink;
    }

}
