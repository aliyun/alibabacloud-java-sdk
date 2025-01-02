// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    /**
     * <p>The names of attacked applications. Set the value in the <code>[&quot;AttackApp1&quot;,&quot;AttackApp2&quot;]</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;MySql&quot;,&quot;DNS&quot;]</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>The attack type of the intrusion events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: suspicious connection</li>
     * <li><strong>2</strong>: command execution</li>
     * <li><strong>3</strong>: brute-force attack</li>
     * <li><strong>4</strong>: scanning</li>
     * <li><strong>5</strong>: others</li>
     * <li><strong>6</strong>: information leak</li>
     * <li><strong>7</strong>: DoS attack</li>
     * <li><strong>8</strong>: buffer overflow attack</li>
     * <li><strong>9</strong>: web attack</li>
     * <li><strong>10</strong>: trojan backdoor</li>
     * <li><strong>11</strong>: computer worm</li>
     * <li><strong>12</strong>: mining</li>
     * <li><strong>13</strong>: reverse shell</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the intrusion events of all attack types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The edition of Cloud Firewall that you purchase. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Premium Edition</li>
     * <li><strong>3</strong>: Enterprise Edition</li>
     * <li><strong>4</strong>: Ultimate Edition</li>
     * <li><strong>10</strong>: Cloud Firewall that uses the pay-as-you-go billing method</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyVersion")
    public Long buyVersion;

    /**
     * <p>The number of the page to return. Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the risk events.\
     * Set the value to <strong>session</strong>, which indicates intrusion events.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The direction of the traffic for the intrusion events. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound</li>
     * <li><strong>out</strong>: outbound</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the intrusion events that are recorded for both inbound and outbound traffic are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The ID of the destination VPC.</p>
     * <blockquote>
     * <p>If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
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
     * <p>The name of the intrusion event.</p>
     * 
     * <strong>example:</strong>
     * <p>Webshell communication</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The type of the firewall. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewall</li>
     * <li><strong>InternetFirewall</strong>: Internet firewall (default)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>Whether to query only the data that has completed private network tracing.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOnlyPrivateAssoc")
    public String isOnlyPrivateAssoc;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to query the information about the geographical locations of IP addresses.</p>
     * <ul>
     * <li><strong>true</strong>: does not query the information about the geographical locations of IP addresses.</li>
     * <li><strong>false</strong>: queries the information about the geographical locations of IP addresses. This is the default value.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoLocation")
    public String noLocation;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>asc</strong>: the ascending order.</li>
     * <li><strong>desc</strong>: the descending order. This is the default value.</li>
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
     * <p>The status of the firewall. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: alerting</li>
     * <li><strong>2</strong>: blocking</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all intrusion events that are detected by the firewall are queried, regardless of the firewall status.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The module of the rule that is used to detect the intrusion events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: basic protection</li>
     * <li><strong>2</strong>: virtual patching</li>
     * <li><strong>4</strong>: threat intelligence</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the intrusion events that are detected by all rules are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSource")
    public String ruleSource;

    /**
     * <p>The field based on which you want to sort the results. Valid values:</p>
     * <ul>
     * <li><strong>VulLevel</strong>: The results are sorted based on the risk level field. This is the default value.</li>
     * <li><strong>LastTime</strong>: The results are sorted based on the most recent occurrence time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LastTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address to query. If you specify this parameter, all intrusion events with the specified source IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The ID of the source VPC.</p>
     * <blockquote>
     * <p>If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6e9a9zyokj2ywuo****</p>
     */
    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408189</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The risk level of the intrusion events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low</li>
     * <li><strong>2</strong>: medium</li>
     * <li><strong>3</strong>: high</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the intrusion events that are at all risk levels are queried.</p>
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
