// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    // The name list of the attacked application.
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    // The attack type of the intrusion events. Valid values:
    // 
    // * **1**: suspicious connection
    // * **2**: command execution
    // * **3**: brute-force attack
    // * **4**: scanning
    // * **5**: others
    // * **6**: information leak
    // * **7**: DoS attack
    // * **8**: buffer overflow attack
    // * **9**: web attack
    // * **10**: trojan backdoor
    // * **11**: computer worm
    // * **12**: mining
    // * **13**: reverse shell
    // 
    // > If you do not specify this parameter, the intrusion events of all attack types are queried.
    @NameInMap("AttackType")
    public String attackType;

    // The edition of Cloud Firewall that you purchase. Valid values:
    // 
    // * **2**: Premium Edition
    // * **3**: Enterprise Edition
    // * **4**: Ultimate Edition
    // * **10**: pay-as-you-go edition
    @NameInMap("BuyVersion")
    public Long buyVersion;

    // The number of the page to return.
    // 
    // Default value: **1**.
    @NameInMap("CurrentPage")
    public String currentPage;

    // The type of the risk events.
    // 
    // Set the value to **session**, which indicates intrusion events.
    @NameInMap("DataType")
    public String dataType;

    // The direction of the traffic for the intrusion events. Valid values:
    // 
    // * **in**: inbound
    // * **out**: outbound
    // 
    // >  If you do not specify this parameter, the intrusion events in both inbound and outbound directions are queried.
    @NameInMap("Direction")
    public String direction;

    // The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.
    @NameInMap("DstIP")
    public String dstIP;

    // The ID of the destination VPC.
    // 
    // >  You must specify this parameter when the FirewallType parameter is set to VpcFirewall.
    @NameInMap("DstNetworkInstanceId")
    public String dstNetworkInstanceId;

    // The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("EndTime")
    public String endTime;

    // The type of the firewall. Valid values:
    // 
    // * **VpcFirewall**: virtual private cloud (VPC) firewall
    // * **InternetFirewall**: Internet firewall (default)
    @NameInMap("FirewallType")
    public String firewallType;

    // The language of the content within the request and the response. Valid values:
    // 
    // * **zh**: Chinese (default)
    // * **en**: English
    @NameInMap("Lang")
    public String lang;

    // Specifies whether to query the information about the geographical locations of IP addresses.
    // 
    // * **true**: does not query the information about the geographical locations of IP addresses.
    // * **false**: queries the information about the geographical locations of IP addresses. This is the default value.
    @NameInMap("NoLocation")
    public String noLocation;

    // The method that is used to sort the results. Valid values:
    // 
    // *   **asc**: the ascending order
    // *   **desc**: the descending order. This is the default value.
    @NameInMap("Order")
    public String order;

    // The number of entries to return on each page.
    // 
    // Default value: **6**. Maximum value: **10**.
    @NameInMap("PageSize")
    public String pageSize;

    // The status of the firewall. Valid values:
    // 
    // * **1**: alerting
    // * **2**: blocking
    // 
    // > If you do not specify this parameter, the intrusion events that are detected by all firewalls are queried.
    @NameInMap("RuleResult")
    public String ruleResult;

    // The module of the rule that is used to detect the intrusion events. Valid values:
    // 
    // * **1**: basic protection
    // * **2**: virtual patching
    // * **4**: threat intelligence
    // 
    // > If you do not specify this parameter, the intrusion events that are detected by using all rules are queried.
    @NameInMap("RuleSource")
    public String ruleSource;

    // The field based on which the results are sorted. Valid values:
    // 
    // *   **VulLevel**: The results are sorted based on the risk level field. This is the default value.
    // *   **LastTime**: The results are sorted based on the most recent occurrence time.
    @NameInMap("Sort")
    public String sort;

    // The source IP address to query. If you specify this parameter, all intrusion events from the specified source IP address are queried.
    @NameInMap("SrcIP")
    public String srcIP;

    // The ID of the source VPC.
    // 
    // >  You must specify this parameter when the FirewallType parameter is set to VpcFirewall.
    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    // The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.
    @NameInMap("StartTime")
    public String startTime;

    // The risk level of the intrusion events. Valid values:
    // 
    // * **1**: low
    // * **2**: medium
    // * **3**: high
    // 
    // > If you do not specify this parameter, the intrusion events that are at all risk levels are queried.
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

    public DescribeRiskEventGroupRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
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
