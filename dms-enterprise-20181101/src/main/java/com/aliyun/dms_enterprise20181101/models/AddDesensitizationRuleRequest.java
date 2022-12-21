// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddDesensitizationRuleRequest extends TeaModel {
    @NameInMap("FunctionParams")
    public java.util.List<java.util.Map<String, String>> functionParams;

    // The type of the masking algorithm.
    @NameInMap("FunctionType")
    public String functionType;

    // The description of the rule.
    @NameInMap("RuleDescription")
    public String ruleDescription;

    // The name of the rule.
    @NameInMap("RuleName")
    public String ruleName;

    // The masking algorithm.
    @NameInMap("RuleType")
    public String ruleType;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
    @NameInMap("Tid")
    public Long tid;

    public static AddDesensitizationRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        AddDesensitizationRuleRequest self = new AddDesensitizationRuleRequest();
        return TeaModel.build(map, self);
    }

    public AddDesensitizationRuleRequest setFunctionParams(java.util.List<java.util.Map<String, String>> functionParams) {
        this.functionParams = functionParams;
        return this;
    }
    public java.util.List<java.util.Map<String, String>> getFunctionParams() {
        return this.functionParams;
    }

    public AddDesensitizationRuleRequest setFunctionType(String functionType) {
        this.functionType = functionType;
        return this;
    }
    public String getFunctionType() {
        return this.functionType;
    }

    public AddDesensitizationRuleRequest setRuleDescription(String ruleDescription) {
        this.ruleDescription = ruleDescription;
        return this;
    }
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    public AddDesensitizationRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public AddDesensitizationRuleRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public AddDesensitizationRuleRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
