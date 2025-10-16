// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesToDefaultRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>PHP</p>
     */
    @NameInMap("AttackApp")
    public String attackApp;

    /**
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <strong>example:</strong>
     * <p>[
     *   &quot;uuid_1&quot;,
     *   &quot;uuid_2&quot;
     * ]</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <strong>example:</strong>
     * <p>140.205.118.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    public static ModifyIpsRulesToDefaultRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyIpsRulesToDefaultRequest self = new ModifyIpsRulesToDefaultRequest();
        return TeaModel.build(map, self);
    }

    public ModifyIpsRulesToDefaultRequest setAttackApp(String attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public String getAttackApp() {
        return this.attackApp;
    }

    public ModifyIpsRulesToDefaultRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public ModifyIpsRulesToDefaultRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public ModifyIpsRulesToDefaultRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public ModifyIpsRulesToDefaultRequest setRules(String rules) {
        this.rules = rules;
        return this;
    }
    public String getRules() {
        return this.rules;
    }

    public ModifyIpsRulesToDefaultRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

}
