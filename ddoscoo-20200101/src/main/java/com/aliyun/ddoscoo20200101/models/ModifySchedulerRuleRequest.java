// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class ModifySchedulerRuleRequest extends TeaModel {
    @NameInMap("Param")
    public String param;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public Integer ruleType;

    @NameInMap("Rules")
    public String rules;

    public static ModifySchedulerRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySchedulerRuleRequest self = new ModifySchedulerRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifySchedulerRuleRequest setParam(String param) {
        this.param = param;
        return this;
    }
    public String getParam() {
        return this.param;
    }

    public ModifySchedulerRuleRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ModifySchedulerRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifySchedulerRuleRequest setRuleType(Integer ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public Integer getRuleType() {
        return this.ruleType;
    }

    public ModifySchedulerRuleRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

}
