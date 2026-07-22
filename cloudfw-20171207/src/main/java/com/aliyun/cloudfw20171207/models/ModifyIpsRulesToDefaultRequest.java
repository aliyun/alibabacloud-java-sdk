// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class ModifyIpsRulesToDefaultRequest extends TeaModel {
    /**
     * <p>The attack application.</p>
     * 
     * <strong>example:</strong>
     * <p>PHP</p>
     */
    @NameInMap("AttackApp")
    public String attackApp;

    /**
     * <p>The type of the cloud firewall. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
     * <li><strong>InternetFirewall</strong> (default): the Internet border firewall.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The language of the content. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>basicRule</strong></li>
     * <li><strong>customize</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The rule list. Conditional requirement: when RuleType is set to customize, you must specify at least one of this parameter or AttackApp. If you specify only RuleType without Rules or AttackApp, the API returns ErrorParameters.</p>
     * 
     * <strong>example:</strong>
     * <p>[
     *   &quot;uuid_1&quot;,
     *   &quot;uuid_2&quot;
     * ]</p>
     */
    @NameInMap("Rules")
    public String rules;

    /**
     * <p>The source IP address of the request.</p>
     * 
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
