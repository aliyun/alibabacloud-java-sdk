// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesRequest extends TeaModel {
    /**
     * <p>The type of the Cloud Firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>VpcFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The language of the request and response.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The action of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>alert</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The type of the rule.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>basicRule</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The list of rules.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>[\&quot;4664138c-4f81-4650-9c8d-2230ea0d****\&quot;]</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>218.1.147.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyIpsRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesRequest self = new ModifyIpsRulesRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public ModifyIpsRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyIpsRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public ModifyIpsRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ModifyIpsRulesRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public ModifyIpsRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
