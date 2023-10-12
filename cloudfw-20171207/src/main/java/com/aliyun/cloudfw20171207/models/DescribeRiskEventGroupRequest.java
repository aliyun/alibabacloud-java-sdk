// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeRiskEventGroupRequest extends TeaModel {
    /**
     * <p>The names of attacked applications. Set the value in the `["AttackApp1","AttackApp2"]` format.</p>
     */
    @NameInMap("AttackApp")
    public java.util.List<String> attackApp;

    /**
     * <p>The attack type of the intrusion events. Valid values:</p>
     * <br>
     * <p>*   **1**: suspicious connection</p>
     * <p>*   **2**: command execution</p>
     * <p>*   **3**: brute-force attack</p>
     * <p>*   **4**: scanning</p>
     * <p>*   **5**: others</p>
     * <p>*   **6**: information leak</p>
     * <p>*   **7**: DoS attack</p>
     * <p>*   **8**: buffer overflow attack</p>
     * <p>*   **9**: web attack</p>
     * <p>*   **10**: trojan backdoor</p>
     * <p>*   **11**: computer worm</p>
     * <p>*   **12**: mining</p>
     * <p>*   **13**: reverse shell</p>
     * <br>
     * <p>> If you do not specify this parameter, the intrusion events of all attack types are queried.</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <p>The edition of Cloud Firewall that you purchase. Valid values:</p>
     * <br>
     * <p>*   **2**: Premium Edition</p>
     * <p>*   **3**: Enterprise Edition</p>
     * <p>*   **4**: Ultimate Edition</p>
     * <p>*   **10**: Cloud Firewall that uses the pay-as-you-go billing method</p>
     */
    @NameInMap("BuyVersion")
    public Long buyVersion;

    /**
     * <p>The number of the page to return. Default value: **1**.</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The type of the risk events.\</p>
     * <p>Set the value to **session**, which indicates intrusion events.</p>
     */
    @NameInMap("DataType")
    public String dataType;

    /**
     * <p>The direction of the traffic for the intrusion events. Valid values:</p>
     * <br>
     * <p>*   **in**: inbound</p>
     * <p>*   **out**: outbound</p>
     * <br>
     * <p>> If you do not specify this parameter, the intrusion events that are recorded for both inbound and outbound traffic are queried.</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <p>The destination IP address to query. If you specify this parameter, all intrusion events with the specified destination IP address are queried.</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The ID of the destination VPC.</p>
     * <br>
     * <p>> If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
     */
    @NameInMap("DstNetworkInstanceId")
    public String dstNetworkInstanceId;

    /**
     * <p>The end of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The name of the intrusion event.</p>
     */
    @NameInMap("EventName")
    public String eventName;

    /**
     * <p>The type of the firewall. Valid values:</p>
     * <br>
     * <p>*   **VpcFirewall**: virtual private cloud (VPC) firewall</p>
     * <p>*   **InternetFirewall**: Internet firewall (default)</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>Specifies whether to query the information about the geographical locations of IP addresses.</p>
     * <br>
     * <p>*   **true**: does not query the information about the geographical locations of IP addresses.</p>
     * <p>*   **false**: queries the information about the geographical locations of IP addresses. This is the default value.</p>
     */
    @NameInMap("NoLocation")
    public String noLocation;

    /**
     * <p>The order in which you want to sort the results. Valid values:</p>
     * <br>
     * <p>*   **asc**: the ascending order.</p>
     * <p>*   **desc**: the descending order. This is the default value.</p>
     */
    @NameInMap("Order")
    public String order;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>Default value: **6**. Maximum value: **10**.</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The status of the firewall. Valid values:</p>
     * <br>
     * <p>*   **1**: alerting</p>
     * <p>*   **2**: blocking</p>
     * <br>
     * <p>> If you do not specify this parameter, all intrusion events that are detected by the firewall are queried, regardless of the firewall status.</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The module of the rule that is used to detect the intrusion events. Valid values:</p>
     * <br>
     * <p>*   **1**: basic protection</p>
     * <p>*   **2**: virtual patching</p>
     * <p>*   **4**: threat intelligence</p>
     * <br>
     * <p>> If you do not specify this parameter, the intrusion events that are detected by all rules are queried.</p>
     */
    @NameInMap("RuleSource")
    public String ruleSource;

    /**
     * <p>The field based on which you want to sort the results. Valid values:</p>
     * <br>
     * <p>*   **VulLevel**: The results are sorted based on the risk level field. This is the default value.</p>
     * <p>*   **LastTime**: The results are sorted based on the most recent occurrence time.</p>
     */
    @NameInMap("Sort")
    public String sort;

    /**
     * <p>The source IP address to query. If you specify this parameter, all intrusion events with the specified source IP address are queried.</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The ID of the source VPC.</p>
     * <br>
     * <p>> If the FirewallType parameter is set to VpcFirewall, you must specify this parameter.</p>
     */
    @NameInMap("SrcNetworkInstanceId")
    public String srcNetworkInstanceId;

    /**
     * <p>The beginning of the time range to query. The value is a UNIX timestamp. Unit: seconds.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The risk level of the intrusion events. Valid values:</p>
     * <br>
     * <p>*   **1**: low</p>
     * <p>*   **2**: medium</p>
     * <p>*   **3**: high</p>
     * <br>
     * <p>> If you do not specify this parameter, the intrusion events that are at all risk levels are queried.</p>
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
