// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafRuleRequest extends TeaModel {
    /**
     * <p>The new configurations of the protection rule.</p>
     * <br>
     * <p>> After you modify the configurations of the protection rule, the previous configurations are overwritten.</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The ID of the protection rule. You can specify only one ID in each request.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The new name of the protection rule.</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The new status of the protection rule. Valid values:</p>
     * <br>
     * <p>*   **on**</p>
     * <p>*   **off**</p>
     */
    @NameInMap("RuleStatus")
    public String ruleStatus;

    public static ModifyDcdnWafRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDcdnWafRuleRequest self = new ModifyDcdnWafRuleRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDcdnWafRuleRequest setRuleConfig(String ruleConfig) {
        this.ruleConfig = ruleConfig;
        return this;
    }
    public String getRuleConfig() {
        return this.ruleConfig;
    }

    public ModifyDcdnWafRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public ModifyDcdnWafRuleRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public ModifyDcdnWafRuleRequest setRuleStatus(String ruleStatus) {
        this.ruleStatus = ruleStatus;
        return this;
    }
    public String getRuleStatus() {
        return this.ruleStatus;
    }

}
