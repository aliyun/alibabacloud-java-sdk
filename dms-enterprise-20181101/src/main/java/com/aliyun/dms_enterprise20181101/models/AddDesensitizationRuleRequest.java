// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class AddDesensitizationRuleRequest extends TeaModel {
    @NameInMap("FunctionParams")
    public java.util.List<java.util.Map<String, String>> functionParams;

    @NameInMap("FunctionType")
    public String functionType;

    @NameInMap("RuleDescription")
    public String ruleDescription;

    @NameInMap("RuleName")
    public String ruleName;

    @NameInMap("RuleType")
    public String ruleType;

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
