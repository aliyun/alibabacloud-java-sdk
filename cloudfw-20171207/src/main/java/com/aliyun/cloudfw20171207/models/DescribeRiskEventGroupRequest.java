// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    /**
     * <p>A list of names of the attacked applications. Use the <code>[&quot;AttackApp1&quot;,&quot;AttackApp2&quot;]</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;MySql&quot;,&quot;DNS&quot;]</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>A list of categories of the attacked applications. Use the [&quot;AttackAppCategory1&quot;,&quot;AttackAppCategory2&quot;] format.</p>
     */
    @NameInMap("AttackAppCategory")
    public java.util.List<String> attackAppCategory;

    /**
     * <p>The type of the attack. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: abnormal connection</p>
     * </li>
     * <li><p><strong>2</strong>: command execution</p>
     * </li>
     * <li><p><strong>3</strong>: brute-force attack</p>
     * </li>
     * <li><p><strong>4</strong>: scan</p>
     * </li>
     * <li><p><strong>5</strong>: other</p>
     * </li>
     * <li><p><strong>6</strong>: information leakage</p>
     * </li>
     * <li><p><strong>7</strong>: DoS attack</p>
     * </li>
     * <li><p><strong>8</strong>: overflow attack</p>
     * </li>
     * <li><p><strong>9</strong>: web attack</p>
     * </li>
     * <li><p><strong>10</strong>: backdoor trojan</p>
     * </li>
     * <li><p><strong>11</strong>: virus or worm</p>
     * </li>
     * <li><p><strong>12</strong>: mining behavior</p>
     * </li>
     * <li><p><strong>13</strong>: reverse shell</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, events of all attack types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The edition of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>2</strong>: Premium Edition</p>
     * </li>
     * <li><p><strong>3</strong>: Enterprise Edition</p>
     * </li>
     * <li><p><strong>4</strong>: Ultimate Edition</p>
     * </li>
     * <li><p><strong>10</strong>: pay-as-you-go</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyVersion")
    public Long buyVersion;

    /**
     * <p>The page number of the returned data.
     * Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the risk event.<br>
     * Set the value to <strong>session</strong>, which indicates intrusion prevention events.<br></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The traffic direction of the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><p><strong>in</strong>: inbound</p>
     * </li>
     * <li><p><strong>out</strong>: outbound</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, events in all traffic directions are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The destination IP address to query. If you set this parameter, only intrusion prevention events that contain the specified destination IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The ID of the destination VPC.</p>
     * <blockquote>
     * <p>This parameter is required only when \<code>FirewallType\\</code> is set to \<code>VpcFirewall\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6e9a9zyokj2ywuo****</p>
     */
    @NameInMap("DstNetworkInstanceId")
    public String dstNetworkInstanceId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408267</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the intrusion prevention event.</p>
     * 
     * <strong>example:</strong>
     * <p>wooden horse rear door communication</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The type of the firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>VpcFirewall</strong>: VPC firewall</p>
     * </li>
     * <li><p><strong>InternetFirewall</strong> (default): Internet firewall</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>Specifies whether to query only the data that is traced to private IP addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOnlyPrivateAssoc")
    public String isOnlyPrivateAssoc;

    /**
     * <p>The language of the request and response. Valid values:</p>
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
     * <p>Specifies whether to query the IP address location information. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Does not query the IP geolocation information.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Queries the IP geolocation information.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoLocation")
    public String noLocation;

    /**
     * <p>The sorting order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending</p>
     * </li>
     * <li><p><strong>desc</strong> (default): descending</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: <strong>6</strong>. Maximum value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The handling status of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Alert</p>
     * </li>
     * <li><p><strong>2</strong>: Block</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, events in all handling statuses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The source of the rule that is used to detect the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: basic protection</p>
     * </li>
     * <li><p><strong>2</strong>: virtual patching</p>
     * </li>
     * <li><p><strong>4</strong>: threat intelligence</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, events detected based on all types of rules are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSource")
    public String ruleSource;

    /**
     * <p>The field to use for sorting. Valid values:</p>
     * <ul>
     * <li><p><strong>VulLevel</strong> (default): Sorts by risk level.</p>
     * </li>
     * <li><p><strong>LastTime</strong>: Sorts by the most recent occurrence time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LastTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address to query. If you set this parameter, only intrusion prevention events that contain the specified source IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The ID of the source VPC.</p>
     * <blockquote>
     * <p>This parameter is required only when \<code>FirewallType\\</code> is set to \<code>VpcFirewall\\</code>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6e9a9zyokj2ywuo****</p>
     */
    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    /**
     * <p>The start of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408189</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The risk level of the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: low</p>
     * </li>
     * <li><p><strong>2</strong>: medium</p>
     * </li>
     * <li><p><strong>3</strong>: high</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>If you do not set this parameter, events of all risk levels are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulLevel")
    public String vulLevel;

    public static DescribeRiskEventGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskEventGroupRequest self = new DescribeRiskEventGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRiskEventGroupRequest setAttackApp(java.util.List<String> attackApp) {
        this.attackApp = attackApp;
        return this;
    }
    public java.util.List<String> getAttackApp() {
        return this.attackApp;
    }

    public DescribeRiskEventGroupRequest setAttackAppCategory(java.util.List<String> attackAppCategory) {
        this.attackAppCategory = attackAppCategory;
        return this;
    }
    public java.util.List<String> getAttackAppCategory() {
        return this.attackAppCategory;
    }

    public DescribeRiskEventGroupRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeRiskEventGroupRequest setBuyVersion(Long buyVersion) {
        this.buyVersion = buyVersion;
        return this;
    }
    public Long getBuyVersion() {
        return this.buyVersion;
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

    public DescribeRiskEventGroupRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeRiskEventGroupRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeRiskEventGroupRequest setDstNetworkInstanceId(String dstNetworkInstanceId) {
        this.dstNetworkInstanceId = dstNetworkInstanceId;
        return this;
    }
    public String getDstNetworkInstanceId() {
        return this.dstNetworkInstanceId;
    }

    public DescribeRiskEventGroupRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRiskEventGroupRequest setEventName(String eventName) {
        this.eventName = eventName;
        return this;
    }
    public String getEventName() {
        return this.eventName;
    }

    public DescribeRiskEventGroupRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeRiskEventGroupRequest setIsOnlyPrivateAssoc(String isOnlyPrivateAssoc) {
        this.isOnlyPrivateAssoc = isOnlyPrivateAssoc;
        return this;
    }
    public String getIsOnlyPrivateAssoc() {
        return this.isOnlyPrivateAssoc;
    }

    public DescribeRiskEventGroupRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRiskEventGroupRequest setNoLocation(String noLocation) {
        this.noLocation = noLocation;
        return this;
    }
    public String getNoLocation() {
        return this.noLocation;
    }

    public DescribeRiskEventGroupRequest setOrder(String order) {
        this.order = order;
        return this;
    }
    public String getOrder() {
        return this.order;
    }

    public DescribeRiskEventGroupRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeRiskEventGroupRequest setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }
    public String getRuleResult() {
        return this.ruleResult;
    }

    public DescribeRiskEventGroupRequest setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }
    public String getRuleSource() {
        return this.ruleSource;
    }

    public DescribeRiskEventGroupRequest setSort(String sort) {
        this.sort = sort;
        return this;
    }
    public String getSort() {
        return this.sort;
    }

    public DescribeRiskEventGroupRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeRiskEventGroupRequest setSrcNetworkInstanceId(String srcNetworkInstanceId) {
        this.srcNetworkInstanceId = srcNetworkInstanceId;
        return this;
    }
    public String getSrcNetworkInstanceId() {
        return this.srcNetworkInstanceId;
    }

    public DescribeRiskEventGroupRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeRiskEventGroupRequest setVulLevel(String vulLevel) {
        this.vulLevel = vulLevel;
        return this;
    }
    public String getVulLevel() {
        return this.vulLevel;
    }

}
