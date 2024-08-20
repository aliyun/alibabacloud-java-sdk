// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class ModifyDcdnWafRuleRequest extends TeaModel {
    /**
     * <p>The new configurations of the protection rule.</p>
     * <blockquote>
     * <p>After you modify the configurations of the protection rule, the previous configurations are overwritten.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;origin\&quot;:\&quot;custom\&quot;,\&quot;conditions\&quot;:[{\&quot;opValue\&quot;:\&quot;eq\&quot;,\&quot;key\&quot;:\&quot;URL\&quot;,\&quot;values\&quot;:\&quot;/example\&quot;},{\&quot;opValue\&quot;:\&quot;eq\&quot;,\&quot;key\&quot;:\&quot;Header\&quot;,\&quot;values\&quot;:\&quot;3333\&quot;,\&quot;subKey\&quot;:\&quot;trt\&quot;}],\&quot;actionExternal\&quot;:{},\&quot;action\&quot;:\&quot;monitor\&quot;,\&quot;ccStatus\&quot;:1,\&quot;ratelimit\&quot;:{\&quot;target\&quot;:\&quot;remote_addr\&quot;,\&quot;interval\&quot;:\&quot;5\&quot;,\&quot;threshold\&quot;:\&quot;2\&quot;,\&quot;effect\&quot;:\&quot;rule\&quot;,\&quot;status\&quot;:{\&quot;code\&quot;:\&quot;404\&quot;,\&quot;count\&quot;:\&quot;2\&quot;},\&quot;ttl\&quot;:\&quot;1800\&quot;}}\&quot;</p>
     */
    @NameInMap("RuleConfig")
    public String ruleConfig;

    /**
     * <p>The ID of the protection rule. You can specify only one ID in each request.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>200001</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The new name of the protection rule.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The new status of the protection rule. Valid values:</p>
     * <ul>
     * <li><strong>on</strong></li>
     * <li><strong>off</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>off</p>
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
