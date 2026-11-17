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
     * <p>The Cloud Firewall type. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewall</li>
     * <li><strong>InternetFirewall</strong> (default): the Internet firewall</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The language type. Valid values:</p>
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
     * <p>Instance ID of the NAT firewall instance. This parameter is required only when FirewallType is set to <strong>NatFirewall</strong>. In this case, the scope is the rules under this instance. This parameter is ignored for Internet and VPC firewalls. You can call the <a href="https://help.aliyun.com/document_detail/2879296.html">ListNatFirewallIpsConfigs</a> operation to query instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>proxy-nat53f4bbc233234271a1d7</p>
     */
    @NameInMap("ProxyId")
    public String proxyId;

    /**
     * <p>The rule type. Valid values:</p>
     * <ul>
     * <li><strong>basicRule</strong></li>
     * <li><strong>customize</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>customize</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The list of rules. This parameter is conditionally required: when RuleType is set to customize, you must specify at least one of this parameter or AttackApp. If you specify only RuleType without Rules or AttackApp, the API returns an ErrorParameters error.</p>
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
     * <p>The source IP address of the requester.</p>
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

    public ModifyIpsRulesToDefaultRequest setProxyId(String proxyId) {
        this.proxyId = proxyId;
        return this;
    }
    public String getProxyId() {
        return this.proxyId;
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
