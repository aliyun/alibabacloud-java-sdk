// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414.models;

import com.aliyun.tea.*;

public class DeleteFlowItemRuleRequest extends TeaModel {
    // ItemRule返回的ruleItemId
    @NameInMap("RuleItemId")
    public java.util.List<String> ruleItemId;

    // 命名空间ID
    @NameInMap("MshaTenantId")
    public String mshaTenantId;

    // 单元
    @NameInMap("UnitFlag")
    public String unitFlag;

    // 是否立即生效
    @NameInMap("Effective")
    public Boolean effective;

    public static DeleteFlowItemRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteFlowItemRuleRequest self = new DeleteFlowItemRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteFlowItemRuleRequest setRuleItemId(java.util.List<String> ruleItemId) {
        this.ruleItemId = ruleItemId;
        return this;
    }
    public java.util.List<String> getRuleItemId() {
        return this.ruleItemId;
    }

    public DeleteFlowItemRuleRequest setMshaTenantId(String mshaTenantId) {
        this.mshaTenantId = mshaTenantId;
        return this;
    }
    public String getMshaTenantId() {
        return this.mshaTenantId;
    }

    public DeleteFlowItemRuleRequest setUnitFlag(String unitFlag) {
        this.unitFlag = unitFlag;
        return this;
    }
    public String getUnitFlag() {
        return this.unitFlag;
    }

    public DeleteFlowItemRuleRequest setEffective(Boolean effective) {
        this.effective = effective;
        return this;
    }
    public Boolean getEffective() {
        return this.effective;
    }

}
