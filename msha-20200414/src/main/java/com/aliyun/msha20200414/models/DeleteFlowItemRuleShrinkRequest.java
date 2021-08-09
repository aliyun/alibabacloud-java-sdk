// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class DeleteFlowItemRuleShrinkRequest extends TeaModel {
    // ItemRule返回的ruleItemId
    @NameInMap("RuleItemId")
    public String ruleItemIdShrink;

    // 命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 是否立即生效
    @NameInMap("Effective")
    public Boolean effective;

    public static DeleteFlowItemRuleShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowItemRuleShrinkRequest self = new DeleteFlowItemRuleShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowItemRuleShrinkRequest setRuleItemIdShrink(String ruleItemIdShrink) {
        this.ruleItemIdShrink = ruleItemIdShrink;
        return this;
    }
    public String getRuleItemIdShrink() {
        return this.ruleItemIdShrink;
    }

    public DeleteFlowItemRuleShrinkRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public DeleteFlowItemRuleShrinkRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public DeleteFlowItemRuleShrinkRequest setEffective(Boolean effective) {
        this.effective = effective;
        return this;
    }
    public Boolean getEffective() {
        return this.effective;
    }

}
