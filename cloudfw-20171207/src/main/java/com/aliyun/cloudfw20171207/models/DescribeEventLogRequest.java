// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeEventLogRequest extends TeaModel {
    /**
     * <p>The attack type of the intrusion prevention event. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Abnormal connection.</li>
     * <li><strong>2</strong>: Command execution.</li>
     * <li><strong>3</strong>: Brute-force attack.</li>
     * <li><strong>4</strong>: Scanning.</li>
     * <li><strong>5</strong>: Other.</li>
     * <li><strong>6</strong>: Information leakage.</li>
     * <li><strong>7</strong>: DoS attack.</li>
     * <li><strong>8</strong>: Overflow attack.</li>
     * <li><strong>9</strong>: Web attack.</li>
     * <li><strong>10</strong>: Trojan backdoor.</li>
     * <li><strong>11</strong>: Viruses and worms.</li>
     * <li><strong>12</strong>: Mining behavior.</li>
     * <li><strong>13</strong>: Reverse shell.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all attack types are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>13</p>
     */
    @NameInMap("AttackType")
    public Long attackType;

    /**
     * <p>The page number for a paged query.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <p>The destination IP address to query. If you specify this parameter, the system queries intrusion prevention events that involve this destination IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.XX.XX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <p>The end time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1731551104</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The type of the Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>VpcFirewall</strong>: virtual private cloud (VPC) firewalls.</li>
     * <li><strong>InternetFirewall</strong> (default): the Internet Border firewall.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>[
     *   &quot;internet&quot;,
     *   &quot;vpc&quot;,
     *   &quot;nat&quot;
     * ]</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <p>The language of the response message.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The log type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("LogType")
    public String logType;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Default value: <strong>6</strong>, which indicates that 6 entries are returned on each page. Maximum value: <strong>10</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The defense status of the Cloud Firewall. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: Alert.</li>
     * <li><strong>2</strong>: Block.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, all defense statuses are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <p>The tracing code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <p>The source IP address of the requester.</p>
     * 
     * <strong>example:</strong>
     * <p>60.182.79.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The source IP address to query. If you specify this parameter, the system queries intrusion prevention events that involve this source IP address.</p>
     * 
     * <strong>example:</strong>
     * <p>47.92.x.x</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <p>The start time of the query. The value is a UNIX timestamp in seconds.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1692504764000</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeEventLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogRequest self = new DescribeEventLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogRequest setAttackType(Long attackType) {
        this.attackType = attackType;
        return this;
    }
    public Long getAttackType() {
        return this.attackType;
    }

    public DescribeEventLogRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventLogRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeEventLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeEventLogRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeEventLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeEventLogRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeEventLogRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeEventLogRequest setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }
    public String getRuleResult() {
        return this.ruleResult;
    }

    public DescribeEventLogRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeEventLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeEventLogRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeEventLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
