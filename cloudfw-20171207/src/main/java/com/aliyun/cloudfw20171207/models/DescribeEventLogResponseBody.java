// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeEventLogResponseBody extends TeaModel {
    /**
     * <p>The list of ISPs.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeEventLogResponseBodyDataList> dataList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D19D8F70-D64B-5A95-905A-6073BF4A****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEventLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventLogResponseBody self = new DescribeEventLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventLogResponseBody setDataList(java.util.List<DescribeEventLogResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeEventLogResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeEventLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventLogResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEventLogResponseBodyDataList extends TeaModel {
        /**
         * <p>The application type supported by the access control policy. We recommend that you use ApplicationNameList. Valid values:</p>
         * <ul>
         * <li><strong>FTP</strong></li>
         * <li><strong>HTTP</strong></li>
         * <li><strong>HTTPS</strong></li>
         * <li><strong>Memcache</strong></li>
         * <li><strong>MongoDB</strong></li>
         * <li><strong>MQTT</strong></li>
         * <li><strong>MySQL</strong></li>
         * <li><strong>RDP</strong></li>
         * <li><strong>Redis</strong></li>
         * <li><strong>SMTP</strong></li>
         * <li><strong>SMTPS</strong></li>
         * <li><strong>SSH</strong></li>
         * <li><strong>SSL</strong></li>
         * <li><strong>VNC</strong></li>
         * <li><strong>ANY</strong> (all application types)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ANY</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The name of the attacked application.</p>
         * 
         * <strong>example:</strong>
         * <p>MySql</p>
         */
        @NameInMap("AttackApp")
        public String attackApp;

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
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackType")
        public Long attackType;

        /**
         * <p>The traffic direction of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>in</strong>: Inbound.</li>
         * <li><strong>out</strong>: Outbound.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The destination IP address that is queried. This indicates that the intrusion prevention event involves this destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.2.2</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <p>The destination port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DstPort")
        public Integer dstPort;

        /**
         * <p>The hit content.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("HitContent")
        public String hitContent;

        /**
         * <p>The hit type.</p>
         * 
         * <strong>example:</strong>
         * <p>domain</p>
         */
        @NameInMap("HitType")
        public String hitType;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>14151892****7022</p>
         */
        @NameInMap("MemberUid")
        public Long memberUid;

        /**
         * <p>The ID of the protection rule for the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000-0000-0000-0000-000000000000</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The defense status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Alert.</li>
         * <li><strong>2</strong>: Block.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <p>The source of the detection rule for the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Basic protection.</li>
         * <li><strong>2</strong>: Virtual patches.</li>
         * <li><strong>4</strong>: Threat intelligence.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleSource")
        public Long ruleSource;

        /**
         * <p>The SNI used when the TLS connection is established.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("Sni")
        public String sni;

        /**
         * <p>The source IP address that is queried. This indicates that the intrusion prevention event involves this source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>192.0.XX.XX</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The source port.</p>
         * 
         * <strong>example:</strong>
         * <p>20206</p>
         */
        @NameInMap("SrcPort")
        public Integer srcPort;

        /**
         * <p>The cipher suite used for TLS handshake negotiation, such as TLS_AES_128_GCM_SHA256.</p>
         * 
         * <strong>example:</strong>
         * <p>TLS_AES_128_GCM_SHA256</p>
         */
        @NameInMap("SslCipher")
        public String sslCipher;

        /**
         * <p>The phase in which the TLS handshake fails, such as Certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Certificate</p>
         */
        @NameInMap("SslErrorIndex")
        public String sslErrorIndex;

        /**
         * <p>The reason why the TLS handshake fails, such as BAD_PACKET_LENGTH.</p>
         * 
         * <strong>example:</strong>
         * <p>BAD_PACKET_LENGTH</p>
         */
        @NameInMap("SslErrorMsg")
        public String sslErrorMsg;

        /**
         * <p>The TLS handshake result. For example, success indicates that the handshake is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("SslHandshakeRes")
        public String sslHandshakeRes;

        /**
         * <p>The TLS version, such as TLSv1.3.</p>
         * 
         * <strong>example:</strong>
         * <p>TLSv1.3</p>
         */
        @NameInMap("SslProtocol")
        public String sslProtocol;

        /**
         * <p>The start time of the data. The value is a timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751423362</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The document path.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/task3%DF%5C%5C">http://example.com/task3%DF\\</a>&quot;</p>
         */
        @NameInMap("Url")
        public String url;

        /**
         * <p>The severity level of the intrusion prevention event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Low.</li>
         * <li><strong>2</strong>: Medium.</li>
         * <li><strong>3</strong>: High.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VulLevel")
        public Long vulLevel;

        public static DescribeEventLogResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventLogResponseBodyDataList self = new DescribeEventLogResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeEventLogResponseBodyDataList setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public DescribeEventLogResponseBodyDataList setAttackApp(String attackApp) {
            this.attackApp = attackApp;
            return this;
        }
        public String getAttackApp() {
            return this.attackApp;
        }

        public DescribeEventLogResponseBodyDataList setAttackType(Long attackType) {
            this.attackType = attackType;
            return this;
        }
        public Long getAttackType() {
            return this.attackType;
        }

        public DescribeEventLogResponseBodyDataList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeEventLogResponseBodyDataList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeEventLogResponseBodyDataList setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public DescribeEventLogResponseBodyDataList setHitContent(String hitContent) {
            this.hitContent = hitContent;
            return this;
        }
        public String getHitContent() {
            return this.hitContent;
        }

        public DescribeEventLogResponseBodyDataList setHitType(String hitType) {
            this.hitType = hitType;
            return this;
        }
        public String getHitType() {
            return this.hitType;
        }

        public DescribeEventLogResponseBodyDataList setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeEventLogResponseBodyDataList setMemberUid(Long memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public Long getMemberUid() {
            return this.memberUid;
        }

        public DescribeEventLogResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeEventLogResponseBodyDataList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeEventLogResponseBodyDataList setRuleResult(Integer ruleResult) {
            this.ruleResult = ruleResult;
            return this;
        }
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        public DescribeEventLogResponseBodyDataList setRuleSource(Long ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public Long getRuleSource() {
            return this.ruleSource;
        }

        public DescribeEventLogResponseBodyDataList setSni(String sni) {
            this.sni = sni;
            return this;
        }
        public String getSni() {
            return this.sni;
        }

        public DescribeEventLogResponseBodyDataList setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public DescribeEventLogResponseBodyDataList setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public Integer getSrcPort() {
            return this.srcPort;
        }

        public DescribeEventLogResponseBodyDataList setSslCipher(String sslCipher) {
            this.sslCipher = sslCipher;
            return this;
        }
        public String getSslCipher() {
            return this.sslCipher;
        }

        public DescribeEventLogResponseBodyDataList setSslErrorIndex(String sslErrorIndex) {
            this.sslErrorIndex = sslErrorIndex;
            return this;
        }
        public String getSslErrorIndex() {
            return this.sslErrorIndex;
        }

        public DescribeEventLogResponseBodyDataList setSslErrorMsg(String sslErrorMsg) {
            this.sslErrorMsg = sslErrorMsg;
            return this;
        }
        public String getSslErrorMsg() {
            return this.sslErrorMsg;
        }

        public DescribeEventLogResponseBodyDataList setSslHandshakeRes(String sslHandshakeRes) {
            this.sslHandshakeRes = sslHandshakeRes;
            return this;
        }
        public String getSslHandshakeRes() {
            return this.sslHandshakeRes;
        }

        public DescribeEventLogResponseBodyDataList setSslProtocol(String sslProtocol) {
            this.sslProtocol = sslProtocol;
            return this;
        }
        public String getSslProtocol() {
            return this.sslProtocol;
        }

        public DescribeEventLogResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeEventLogResponseBodyDataList setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public DescribeEventLogResponseBodyDataList setVulLevel(Long vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public Long getVulLevel() {
            return this.vulLevel;
        }

    }

}
