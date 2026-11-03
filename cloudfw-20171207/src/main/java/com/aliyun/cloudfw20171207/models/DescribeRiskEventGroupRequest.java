// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    /**
     * <p>The list of names of the attacked applications. Specify the value in the <code>[&quot;AttackApp1&quot;,&quot;AttackApp2&quot;]</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;MySql&quot;,&quot;DNS&quot;]</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>The list of categories of the attacked applications. Specify the value in the <code>[&quot;AttackAppCategory1&quot;,&quot;AttackAppCategory2&quot;]</code> format.</p>
     */
    @NameInMap("AttackAppCategory")
    public java.util.List<String> attackAppCategory;

    /**
     * <p>The attack type of the intrusion prevention events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: abnormal connection.</li>
     * <li><strong>2</strong>: command execute.</li>
     * <li><strong>3</strong>: brute-force attacks.</li>
     * <li><strong>4</strong>: scan.</li>
     * <li><strong>5</strong>: other.</li>
     * <li><strong>6</strong>: information leak.</li>
     * <li><strong>7</strong>: DoS attack.</li>
     * <li><strong>8</strong>: overflow attack.</li>
     * <li><strong>9</strong>: web attack.</li>
     * <li><strong>10</strong>: trojan backdoor.</li>
     * <li><strong>11</strong>: virus worm.</li>
     * <li><strong>12</strong>: mining behavior.</li>
     * <li><strong>13</strong>: reverse shell.</li>
     * </ul>
     * <blockquote>
     * <p>If the Settings for this parameter are not specified, events of all attack types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The purchased edition. Valid values:</p>
     * <ul>
     * <li><strong>2</strong>: Premium Edition.</li>
     * <li><strong>3</strong>: Enterprise Edition.</li>
     * <li><strong>4</strong>: Ultimate Edition.</li>
     * <li><strong>10</strong>: Pay-as-you-go Edition.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("BuyVersion")
    public Long buyVersion;

    /**
     * <p>The paging Settings for the page number to return in a paged query.
     * Default value: <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The risk event type. Valid value:  </p>
     * <ul>
     * <li><strong>session</strong>: intrusion prevention event.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>session</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The traffic direction of the intrusion prevention events. Valid values:</p>
     * <ul>
     * <li><strong>in</strong>: inbound.</li>
     * <li><strong>out</strong>: outbound.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, events in all traffic directions are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>in</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The destination IP address to query. If you specify this parameter, intrusion prevention events that involve the specified destination IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The instance ID of the destination VPC-connected instance.</p>
     * <blockquote>
     * <p>This parameter is required only when the FirewallType Settings is VpcFirewall.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6e9a9zyokj2ywuo****</p>
     */
    @NameInMap("DstNetworkInstanceId")
    public String dstNetworkInstanceId;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
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
     * <p>The type of the cloud firewall. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
     * <li><strong>InternetFirewall</strong> (default): the Internet Border firewall.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>InternetFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>Specifies whether to query only the data for which private IP tracing is completed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("IsOnlyPrivateAssoc")
    public String isOnlyPrivateAssoc;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese.</li>
     * <li><strong>en</strong>: English.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to query IP geolocation information. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: IP geolocation information is not queried.</li>
     * <li><strong>false</strong> (default): IP geolocation information is queried.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("NoLocation")
    public String noLocation;

    /**
     * <p>The sort order. Valid values:</p>
     * <ul>
     * <li><p><strong>asc</strong>: ascending order.</p>
     * </li>
     * <li><p><strong>desc</strong> (default): descending order.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>desc</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The paging Settings for the number of entries to return on each page in a paged query.</p>
     * <p>Default value: <strong>6</strong>. Maximum value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The defense status of Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: alert.</li>
     * <li><strong>2</strong>: block.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, events in all defense statuses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The source of the detection rule for the intrusion prevention events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: basic protection.</li>
     * <li><strong>2</strong>: virtual patches.</li>
     * <li><strong>4</strong>: threat intelligence.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, events detected by rules from all sources are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSource")
    public String ruleSource;

    /**
     * <p>The field by which to sort the results. Valid values:</p>
     * <ul>
     * <li><p><strong>VulLevel</strong> (default): sort by severity level.</p>
     * </li>
     * <li><p><strong>LastTime</strong>: sort by the most recent occurrence time.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>LastTime</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address to query. If you specify this parameter, intrusion prevention events that involve the specified source IP address are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>192.0.XX.XX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The instance ID of the source VPC-connected instance.</p>
     * <blockquote>
     * <p>This parameter is required only when the FirewallType Settings is VpcFirewall.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vpc-uf6e9a9zyokj2ywuo****</p>
     */
    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1534408189</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The severity level of the intrusion prevention events. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: low.</li>
     * <li><strong>2</strong>: medium.</li>
     * <li><strong>3</strong>: high.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, events at all severity levels are queried.</p>
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
