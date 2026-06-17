// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeIPSRulesRequest extends TeaModel {
    /**
     * <p>The application targeted by the attack.</p>
     * 
     * <strong>example:</strong>
     * <p>SMB</p>
     */
    @NameInMap("AttackApp")
    public String attackApp;

    /**
     * <p>The categories of applications targeted by attacks.</p>
     */
    @NameInMap("AttackAppCategory")
    public java.util.List<String> attackAppCategory;

    /**
     * <p>The applications targeted by attacks.</p>
     */
    @NameInMap("AttackApps")
    public java.util.List<String> attackApps;

    /**
     * <p>The attack type.</p>
     * 
     * <strong>example:</strong>
     * <p>Web attack</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The CVE ID.</p>
     * 
     * <strong>example:</strong>
     * <p>CVE-2026-25253</p>
     */
    @NameInMap("Cve")
    public String cve;

    /**
     * <p>The status of the rule.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DefaultAction")
    public String defaultAction;

    /**
     * <p>The type of firewall.</p>
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
     * <p>The sort order.</p>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The page number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <p>The number of entries per page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Indicates whether to retrieve only modified rules.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("QueryModify")
    public String queryModify;

    /**
     * <p>The rule action.</p>
     * 
     * <strong>example:</strong>
     * <p>alert</p>
     */
    @NameInMap("RuleAction")
    public String ruleAction;

    /**
     * <p>The inspection mode.</p>
     * 
     * <strong>example:</strong>
     * <p>dropStrict</p>
     */
    @NameInMap("RuleClass")
    public String ruleClass;

    /**
     * <p>The rule ID.</p>
     * 
     * <strong>example:</strong>
     * <p>f835533b-01ef-49f4-b172-85bbfd0e****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <p>The rule level.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleLevel")
    public Long ruleLevel;

    /**
     * <p>The rule name.</p>
     * 
     * <strong>example:</strong>
     * <p>Nmap scan detection</p>
     */
    @NameInMap("RuleName")
    public String ruleName;

    /**
     * <p>The rule type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>patchRule</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    /**
     * <p>The field to sort by.</p>
     * 
     * <strong>example:</strong>
     * <p>UpdateTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>8.139.222.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-rnbkqx4a8er21a****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    public static DescribeIPSRulesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeIPSRulesRequest self = new DescribeIPSRulesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeIPSRulesRequest setAttackApp(String attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public String getAttackApp() {
        return this.attackApp;
    }

    public DescribeIPSRulesRequest setAttackAppCategory(java.util.List<String> attackAppCategory) {
        this.attackAppCategory = attackAppCategory;
        return this;
    }
    public java.util.List<String> getAttackAppCategory() {
        return this.attackAppCategory;
    }

    public DescribeIPSRulesRequest setAttackApps(java.util.List<String> attackApps) {
        this.attackApps = attackApps;
        return this;
    }
    public java.util.List<String> getAttackApps() {
        return this.attackApps;
    }

    public DescribeIPSRulesRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeIPSRulesRequest setCve(String cve) {
        this.cve = cve;
        return this;
    }
    public String getCve() {
        return this.cve;
    }

    public DescribeIPSRulesRequest setDefaultAction(String defaultAction) {
        this.defaultAction = defaultAction;
        return this;
    }
    public String getDefaultAction() {
        return this.defaultAction;
    }

    public DescribeIPSRulesRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeIPSRulesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeIPSRulesRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeIPSRulesRequest setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeIPSRulesRequest setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeIPSRulesRequest setQueryModify(String queryModify) {
        this.queryModify = queryModify;
        return this;
    }
    public String getQueryModify() {
        return this.queryModify;
    }

    public DescribeIPSRulesRequest setRuleAction(String ruleAction) {
        this.ruleAction = ruleAction;
        return this;
    }
    public String getRuleAction() {
        return this.ruleAction;
    }

    public DescribeIPSRulesRequest setRuleClass(String ruleClass) {
        this.ruleClass = ruleClass;
        return this;
    }
    public String getRuleClass() {
        return this.ruleClass;
    }

    public DescribeIPSRulesRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeIPSRulesRequest setRuleLevel(Long ruleLevel) {
        this.ruleLevel = ruleLevel;
        return this;
    }
    public Long getRuleLevel() {
        return this.ruleLevel;
    }

    public DescribeIPSRulesRequest setRuleName(String ruleName) {
        this.ruleName = ruleName;
        return this;
    }
    public String getRuleName() {
        return this.ruleName;
    }

    public DescribeIPSRulesRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

    public DescribeIPSRulesRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeIPSRulesRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeIPSRulesRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

}
