// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrafficLogResponseBody extends TeaModel {
    /**
     * <p>The data list.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeTrafficLogResponseBodyDataList> dataList;

    /**
     * <p>The paging information.</p>
     */
    @NameInMap("PageInfo")
    public DescribeTrafficLogResponseBodyPageInfo pageInfo;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>633D92D1-768A-547F-8ADC-2870CF0A99F6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeTrafficLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficLogResponseBody self = new DescribeTrafficLogResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficLogResponseBody setDataList(java.util.List<DescribeTrafficLogResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeTrafficLogResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeTrafficLogResponseBody setPageInfo(DescribeTrafficLogResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeTrafficLogResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeTrafficLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeTrafficLogResponseBodyDataListDstVpc extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The VPC instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vba1c1em97h0ji71b****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The instance name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>yi-vpc</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeTrafficLogResponseBodyDataListDstVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficLogResponseBodyDataListDstVpc self = new DescribeTrafficLogResponseBodyDataListDstVpc();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficLogResponseBodyDataListDstVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeTrafficLogResponseBodyDataListDstVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTrafficLogResponseBodyDataListDstVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeTrafficLogResponseBodyDataListRules extends TeaModel {
        /**
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <p>The rule name.</p>
         * 
         * <strong>example:</strong>
         * <p>sharepoint</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <p>The source of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("RuleSource")
        public String ruleSource;

        public static DescribeTrafficLogResponseBodyDataListRules build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficLogResponseBodyDataListRules self = new DescribeTrafficLogResponseBodyDataListRules();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficLogResponseBodyDataListRules setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeTrafficLogResponseBodyDataListRules setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeTrafficLogResponseBodyDataListRules setRuleSource(String ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public String getRuleSource() {
            return this.ruleSource;
        }

    }

    public static class DescribeTrafficLogResponseBodyDataListSrcVpc extends TeaModel {
        /**
         * <p>The region ID of the source VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The instance ID of the source VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vba1c1em97h0ji71****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The instance name of the source VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>yi-vpc</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeTrafficLogResponseBodyDataListSrcVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficLogResponseBodyDataListSrcVpc self = new DescribeTrafficLogResponseBodyDataListSrcVpc();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficLogResponseBodyDataListSrcVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeTrafficLogResponseBodyDataListSrcVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeTrafficLogResponseBodyDataListSrcVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeTrafficLogResponseBodyDataList extends TeaModel {
        /**
         * <p>The ID of the pre-matched ACL policy. If you leave this parameter empty, all policies are matched.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AclPreRuleId")
        public String aclPreRuleId;

        /**
         * <p>The name of the pre-matched ACL policy.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AclPreRuleName")
        public String aclPreRuleName;

        /**
         * <p>The pre-matching status of the ACL. Valid values:</p>
         * <p><strong>app_unknown</strong>: The application is not detected.</p>
         * <p><strong>domain_unknown</strong>: The domain name is not detected.</p>
         * <p><strong>normal</strong>: Normal.</p>
         * 
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AclPreState")
        public String aclPreState;

        /**
         * <p>The API status. Valid values:</p>
         * <p><strong>none</strong>: Initial state.</p>
         * <p><strong>policy_discard</strong>: The connection failed to be established and was blocked by a user-defined ACL or threat intelligence.</p>
         * <p><strong>tcp_not_establish</strong>: TCP connection failed.</p>
         * <p><strong>no_payload</strong>: The connection is established, but deep packet inspection has analyzed zero payloads.</p>
         * <p><strong>analysing</strong>: Detecting.</p>
         * <p><strong>unknown_loose</strong>: Loose mode. Detection failed. The system continues to detect.</p>
         * <p><strong>unknown_strict</strong>: Strict mode. Detection failed.</p>
         * <p><strong>success</strong>: Detection successful.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("AppDpiState")
        public String appDpiState;

        /**
         * <p>The application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>The name of the attacked application.</p>
         * 
         * <strong>example:</strong>
         * <p>WebLogic</p>
         */
        @NameInMap("AttackApp")
        public String attackApp;

        /**
         * <p>The attack type of the intrusion prevention event.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <p>The city ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FI</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <p>The reason for closing.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp_fin</p>
         */
        @NameInMap("CloseReason")
        public String closeReason;

        /**
         * <p>The ID of the Alibaba Cloud service instance.</p>
         * 
         * <strong>example:</strong>
         * <p>ngw-*</p>
         */
        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        /**
         * <p>The country ID.</p>
         * 
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <p>The traffic direction. Valid values:</p>
         * <ul>
         * <li><p><strong>in</strong>: inbound traffic.</p>
         * </li>
         * <li><p><strong>out</strong>: outbound traffic.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The URL in the flow log.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("DomainUrl")
        public String domainUrl;

        /**
         * <p>The destination IP address found. This indicates that the intrusion prevention event includes this destination IP address.</p>
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
         * <p>The list of destination VPC information.</p>
         */
        @NameInMap("DstVpc")
        public DescribeTrafficLogResponseBodyDataListDstVpc dstVpc;

        /**
         * <p>The end time of the data. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751423363</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>Other extension data.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("Ext")
        public String ext;

        /**
         * <p>The inbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("InBytes")
        public String inBytes;

        /**
         * <p>The number of inbound messages.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("InPackets")
        public String inPackets;

        /**
         * <p>The protocol type.</p>
         * 
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <p>The ISP.</p>
         * 
         * <strong>example:</strong>
         * <p>FOP Dmytro Nedilskyi</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <p>The ISP ID.</p>
         * 
         * <strong>example:</strong>
         * <p>50075069</p>
         */
        @NameInMap("IspId")
        public String ispId;

        /**
         * <p>The region of the source or destination IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>Hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The UID of the Cloud Firewall member account.</p>
         * 
         * <strong>example:</strong>
         * <p>14151892****7022</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The outbound traffic.</p>
         * 
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("OutBytes")
        public String outBytes;

        /**
         * <p>The number of outbound messages.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("OutPackets")
        public String outPackets;

        /**
         * <p>The number of bytes in the packet.</p>
         * 
         * <strong>example:</strong>
         * <p>355</p>
         */
        @NameInMap("PacketBytes")
        public Long packetBytes;

        /**
         * <p>The number of traffic packets.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("PacketCount")
        public Long packetCount;

        /**
         * <p>The private IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.21.234.XXX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <p>The private port.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PrivatePort")
        public Integer privatePort;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the matched rule.</p>
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
         * <p>The final result of the traffic. Valid values:</p>
         * <ul>
         * <li><p><strong>pass</strong>: The traffic is allowed.</p>
         * </li>
         * <li><p><strong>alert</strong>: An alert is generated.</p>
         * </li>
         * <li><p><strong>drop</strong>: The traffic is dropped.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <p>The source of the detection rule that is matched. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: None.</p>
         * </li>
         * <li><p><strong>1</strong>: Basic protection.</p>
         * </li>
         * <li><p><strong>2</strong>: Virtual patching.</p>
         * </li>
         * <li><p><strong>3</strong>: Access control.</p>
         * </li>
         * <li><p><strong>4</strong>: Threat intelligence.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleSource")
        public String ruleSource;

        /**
         * <p>The list of rules.</p>
         */
        @NameInMap("Rules")
        public java.util.List<DescribeTrafficLogResponseBodyDataListRules> rules;

        /**
         * <p>The source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <p>The port of the data source.</p>
         * 
         * <strong>example:</strong>
         * <p>20206</p>
         */
        @NameInMap("SrcPort")
        public Integer srcPort;

        /**
         * <p>The private source IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>172.16.101.7</p>
         */
        @NameInMap("SrcPrivateIP")
        public String srcPrivateIP;

        /**
         * <p>The source VPC information.</p>
         */
        @NameInMap("SrcVpc")
        public DescribeTrafficLogResponseBodyDataListSrcVpc srcVpc;

        /**
         * <p>The start time of the data. This value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1751423362</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ID of the rule that is matched by the TLS inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>tir-xxx</p>
         */
        @NameInMap("TlsRuleId")
        public String tlsRuleId;

        /**
         * <p>The name of the rule that is matched by the TLS inspection.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TlsRuleName")
        public String tlsRuleName;

        /**
         * <p>The ID of the TLS inspection scope.</p>
         * 
         * <strong>example:</strong>
         * <p>tls-xxx</p>
         */
        @NameInMap("TlsScopeId")
        public String tlsScopeId;

        /**
         * <p>The instance ID of the VPC border firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-4045ca7***</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
         * <p>The vulnerability level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VulLevel")
        public Integer vulLevel;

        public static DescribeTrafficLogResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficLogResponseBodyDataList self = new DescribeTrafficLogResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficLogResponseBodyDataList setAclPreRuleId(String aclPreRuleId) {
            this.aclPreRuleId = aclPreRuleId;
            return this;
        }
        public String getAclPreRuleId() {
            return this.aclPreRuleId;
        }

        public DescribeTrafficLogResponseBodyDataList setAclPreRuleName(String aclPreRuleName) {
            this.aclPreRuleName = aclPreRuleName;
            return this;
        }
        public String getAclPreRuleName() {
            return this.aclPreRuleName;
        }

        public DescribeTrafficLogResponseBodyDataList setAclPreState(String aclPreState) {
            this.aclPreState = aclPreState;
            return this;
        }
        public String getAclPreState() {
            return this.aclPreState;
        }

        public DescribeTrafficLogResponseBodyDataList setAppDpiState(String appDpiState) {
            this.appDpiState = appDpiState;
            return this;
        }
        public String getAppDpiState() {
            return this.appDpiState;
        }

        public DescribeTrafficLogResponseBodyDataList setAppId(Integer appId) {
            this.appId = appId;
            return this;
        }
        public Integer getAppId() {
            return this.appId;
        }

        public DescribeTrafficLogResponseBodyDataList setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeTrafficLogResponseBodyDataList setAttackApp(String attackApp) {
            this.attackApp = attackApp;
            return this;
        }
        public String getAttackApp() {
            return this.attackApp;
        }

        public DescribeTrafficLogResponseBodyDataList setAttackType(Integer attackType) {
            this.attackType = attackType;
            return this;
        }
        public Integer getAttackType() {
            return this.attackType;
        }

        public DescribeTrafficLogResponseBodyDataList setCityId(String cityId) {
            this.cityId = cityId;
            return this;
        }
        public String getCityId() {
            return this.cityId;
        }

        public DescribeTrafficLogResponseBodyDataList setCloseReason(String closeReason) {
            this.closeReason = closeReason;
            return this;
        }
        public String getCloseReason() {
            return this.closeReason;
        }

        public DescribeTrafficLogResponseBodyDataList setCloudInstanceId(String cloudInstanceId) {
            this.cloudInstanceId = cloudInstanceId;
            return this;
        }
        public String getCloudInstanceId() {
            return this.cloudInstanceId;
        }

        public DescribeTrafficLogResponseBodyDataList setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }
        public String getCountryId() {
            return this.countryId;
        }

        public DescribeTrafficLogResponseBodyDataList setDirection(String direction) {
            this.direction = direction;
            return this;
        }
        public String getDirection() {
            return this.direction;
        }

        public DescribeTrafficLogResponseBodyDataList setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeTrafficLogResponseBodyDataList setDomainUrl(String domainUrl) {
            this.domainUrl = domainUrl;
            return this;
        }
        public String getDomainUrl() {
            return this.domainUrl;
        }

        public DescribeTrafficLogResponseBodyDataList setDstIP(String dstIP) {
            this.dstIP = dstIP;
            return this;
        }
        public String getDstIP() {
            return this.dstIP;
        }

        public DescribeTrafficLogResponseBodyDataList setDstPort(Integer dstPort) {
            this.dstPort = dstPort;
            return this;
        }
        public Integer getDstPort() {
            return this.dstPort;
        }

        public DescribeTrafficLogResponseBodyDataList setDstVpc(DescribeTrafficLogResponseBodyDataListDstVpc dstVpc) {
            this.dstVpc = dstVpc;
            return this;
        }
        public DescribeTrafficLogResponseBodyDataListDstVpc getDstVpc() {
            return this.dstVpc;
        }

        public DescribeTrafficLogResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeTrafficLogResponseBodyDataList setExt(String ext) {
            this.ext = ext;
            return this;
        }
        public String getExt() {
            return this.ext;
        }

        public DescribeTrafficLogResponseBodyDataList setInBytes(String inBytes) {
            this.inBytes = inBytes;
            return this;
        }
        public String getInBytes() {
            return this.inBytes;
        }

        public DescribeTrafficLogResponseBodyDataList setInPackets(String inPackets) {
            this.inPackets = inPackets;
            return this;
        }
        public String getInPackets() {
            return this.inPackets;
        }

        public DescribeTrafficLogResponseBodyDataList setIpProtocol(String ipProtocol) {
            this.ipProtocol = ipProtocol;
            return this;
        }
        public String getIpProtocol() {
            return this.ipProtocol;
        }

        public DescribeTrafficLogResponseBodyDataList setIsp(String isp) {
            this.isp = isp;
            return this;
        }
        public String getIsp() {
            return this.isp;
        }

        public DescribeTrafficLogResponseBodyDataList setIspId(String ispId) {
            this.ispId = ispId;
            return this;
        }
        public String getIspId() {
            return this.ispId;
        }

        public DescribeTrafficLogResponseBodyDataList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeTrafficLogResponseBodyDataList setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeTrafficLogResponseBodyDataList setOutBytes(String outBytes) {
            this.outBytes = outBytes;
            return this;
        }
        public String getOutBytes() {
            return this.outBytes;
        }

        public DescribeTrafficLogResponseBodyDataList setOutPackets(String outPackets) {
            this.outPackets = outPackets;
            return this;
        }
        public String getOutPackets() {
            return this.outPackets;
        }

        public DescribeTrafficLogResponseBodyDataList setPacketBytes(Long packetBytes) {
            this.packetBytes = packetBytes;
            return this;
        }
        public Long getPacketBytes() {
            return this.packetBytes;
        }

        public DescribeTrafficLogResponseBodyDataList setPacketCount(Long packetCount) {
            this.packetCount = packetCount;
            return this;
        }
        public Long getPacketCount() {
            return this.packetCount;
        }

        public DescribeTrafficLogResponseBodyDataList setPrivateIp(String privateIp) {
            this.privateIp = privateIp;
            return this;
        }
        public String getPrivateIp() {
            return this.privateIp;
        }

        public DescribeTrafficLogResponseBodyDataList setPrivatePort(Integer privatePort) {
            this.privatePort = privatePort;
            return this;
        }
        public Integer getPrivatePort() {
            return this.privatePort;
        }

        public DescribeTrafficLogResponseBodyDataList setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeTrafficLogResponseBodyDataList setRuleId(String ruleId) {
            this.ruleId = ruleId;
            return this;
        }
        public String getRuleId() {
            return this.ruleId;
        }

        public DescribeTrafficLogResponseBodyDataList setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeTrafficLogResponseBodyDataList setRuleResult(Integer ruleResult) {
            this.ruleResult = ruleResult;
            return this;
        }
        public Integer getRuleResult() {
            return this.ruleResult;
        }

        public DescribeTrafficLogResponseBodyDataList setRuleSource(String ruleSource) {
            this.ruleSource = ruleSource;
            return this;
        }
        public String getRuleSource() {
            return this.ruleSource;
        }

        public DescribeTrafficLogResponseBodyDataList setRules(java.util.List<DescribeTrafficLogResponseBodyDataListRules> rules) {
            this.rules = rules;
            return this;
        }
        public java.util.List<DescribeTrafficLogResponseBodyDataListRules> getRules() {
            return this.rules;
        }

        public DescribeTrafficLogResponseBodyDataList setSrcIP(String srcIP) {
            this.srcIP = srcIP;
            return this;
        }
        public String getSrcIP() {
            return this.srcIP;
        }

        public DescribeTrafficLogResponseBodyDataList setSrcPort(Integer srcPort) {
            this.srcPort = srcPort;
            return this;
        }
        public Integer getSrcPort() {
            return this.srcPort;
        }

        public DescribeTrafficLogResponseBodyDataList setSrcPrivateIP(String srcPrivateIP) {
            this.srcPrivateIP = srcPrivateIP;
            return this;
        }
        public String getSrcPrivateIP() {
            return this.srcPrivateIP;
        }

        public DescribeTrafficLogResponseBodyDataList setSrcVpc(DescribeTrafficLogResponseBodyDataListSrcVpc srcVpc) {
            this.srcVpc = srcVpc;
            return this;
        }
        public DescribeTrafficLogResponseBodyDataListSrcVpc getSrcVpc() {
            return this.srcVpc;
        }

        public DescribeTrafficLogResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeTrafficLogResponseBodyDataList setTlsRuleId(String tlsRuleId) {
            this.tlsRuleId = tlsRuleId;
            return this;
        }
        public String getTlsRuleId() {
            return this.tlsRuleId;
        }

        public DescribeTrafficLogResponseBodyDataList setTlsRuleName(String tlsRuleName) {
            this.tlsRuleName = tlsRuleName;
            return this;
        }
        public String getTlsRuleName() {
            return this.tlsRuleName;
        }

        public DescribeTrafficLogResponseBodyDataList setTlsScopeId(String tlsScopeId) {
            this.tlsScopeId = tlsScopeId;
            return this;
        }
        public String getTlsScopeId() {
            return this.tlsScopeId;
        }

        public DescribeTrafficLogResponseBodyDataList setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeTrafficLogResponseBodyDataList setVulLevel(Integer vulLevel) {
            this.vulLevel = vulLevel;
            return this;
        }
        public Integer getVulLevel() {
            return this.vulLevel;
        }

    }

    public static class DescribeTrafficLogResponseBodyPageInfo extends TeaModel {
        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeTrafficLogResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrafficLogResponseBodyPageInfo self = new DescribeTrafficLogResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeTrafficLogResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeTrafficLogResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeTrafficLogResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
