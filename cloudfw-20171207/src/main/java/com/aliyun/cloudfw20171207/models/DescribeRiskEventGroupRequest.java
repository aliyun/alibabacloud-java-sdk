// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("Direction")
    public String direction;

    @NameInMap("PageSize")
    public String pageSize;

    @NameInMap("CurrentPage")
    public String currentPage;

    @NameInMap("DataType")
    public String dataType;

    @NameInMap("RuleSource")
    public String ruleSource;

    @NameInMap("RuleResult")
    public String ruleResult;

    @NameInMap("SrcIP")
    public String srcIP;

    @NameInMap("DstIP")
    public String dstIP;

    @NameInMap("VulLevel")
    public String vulLevel;

    @NameInMap("FirewallType")
    public String firewallType;

    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    @NameInMap("DstNetworkInstanceId")
    public String dstNetworkInstanceId;

    @NameInMap("AttackType")
    public String attackType;

    @NameInMap("NoLocation")
    public String noLocation;

    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    public static DescribeRiskEventGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventGroupRequest self = new DescribeRiskEventGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventGroupRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRiskEventGroupRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventGroupRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeRiskEventGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskEventGroupRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeRiskEventGroupRequest setDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }
    public String getDataType() {
        return this.dataType;
    }

    public DescribeRiskEventGroupRequest setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }
    public String getRuleSource() {
        return this.ruleSource;
    }

    public DescribeRiskEventGroupRequest setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }
    public String getRuleResult() {
        return this.ruleResult;
    }

    public DescribeRiskEventGroupRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeRiskEventGroupRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeRiskEventGroupRequest setVulLevel(String vulLevel) {
        this.vulLevel = vulLevel;
        return this;
    }
    public String getVulLevel() {
        return this.vulLevel;
    }

    public DescribeRiskEventGroupRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeRiskEventGroupRequest setSrcNetworkInstanceId(String srcNetworkInstanceId) {
        this.srcNetworkInstanceId = srcNetworkInstanceId;
        return this;
    }
    public String getSrcNetworkInstanceId() {
        return this.srcNetworkInstanceId;
    }

    public DescribeRiskEventGroupRequest setDstNetworkInstanceId(String dstNetworkInstanceId) {
        this.dstNetworkInstanceId = dstNetworkInstanceId;
        return this;
    }
    public String getDstNetworkInstanceId() {
        return this.dstNetworkInstanceId;
    }

    public DescribeRiskEventGroupRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeRiskEventGroupRequest setNoLocation(String noLocation) {
        this.noLocation = noLocation;
        return this;
    }
    public String getNoLocation() {
        return this.noLocation;
    }

    public DescribeRiskEventGroupRequest setAttackApp(java.util.List<String> attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

}
