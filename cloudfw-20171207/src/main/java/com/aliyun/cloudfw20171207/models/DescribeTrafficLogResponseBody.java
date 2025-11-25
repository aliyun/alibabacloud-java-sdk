// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrafficLogResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeTrafficLogResponseBodyDataList> dataList;

    @NameInMap("PageInfo")
    public DescribeTrafficLogResponseBodyPageInfo pageInfo;

    /**
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
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vpc-8vba1c1em97h0ji71b****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
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
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>sharepoint</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

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

    }

    public static class DescribeTrafficLogResponseBodyDataListSrcVpc extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <strong>example:</strong>
         * <p>vpc-8vba1c1em97h0ji71****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AclPreRuleId")
        public String aclPreRuleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AclPreRuleName")
        public String aclPreRuleName;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("AclPreState")
        public String aclPreState;

        /**
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("AppDpiState")
        public String appDpiState;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("AppId")
        public Integer appId;

        /**
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <strong>example:</strong>
         * <p>WebLogic</p>
         */
        @NameInMap("AttackApp")
        public String attackApp;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AttackType")
        public Integer attackType;

        /**
         * <strong>example:</strong>
         * <p>FI</p>
         */
        @NameInMap("CityId")
        public String cityId;

        /**
         * <strong>example:</strong>
         * <p>tcp_fin</p>
         */
        @NameInMap("CloseReason")
        public String closeReason;

        /**
         * <strong>example:</strong>
         * <p>ngw-*</p>
         */
        @NameInMap("CloudInstanceId")
        public String cloudInstanceId;

        /**
         * <strong>example:</strong>
         * <p>US</p>
         */
        @NameInMap("CountryId")
        public String countryId;

        /**
         * <strong>example:</strong>
         * <p>in</p>
         */
        @NameInMap("Direction")
        public String direction;

        /**
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <strong>example:</strong>
         * <p>xxx.com</p>
         */
        @NameInMap("DomainUrl")
        public String domainUrl;

        /**
         * <strong>example:</strong>
         * <p>2.2.2.2</p>
         */
        @NameInMap("DstIP")
        public String dstIP;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("DstPort")
        public Integer dstPort;

        @NameInMap("DstVpc")
        public DescribeTrafficLogResponseBodyDataListDstVpc dstVpc;

        /**
         * <strong>example:</strong>
         * <p>1751423363</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("Ext")
        public String ext;

        /**
         * <strong>example:</strong>
         * <p>125</p>
         */
        @NameInMap("InBytes")
        public String inBytes;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("InPackets")
        public String inPackets;

        /**
         * <strong>example:</strong>
         * <p>tcp</p>
         */
        @NameInMap("IpProtocol")
        public String ipProtocol;

        /**
         * <strong>example:</strong>
         * <p>FOP Dmytro Nedilskyi</p>
         */
        @NameInMap("Isp")
        public String isp;

        /**
         * <strong>example:</strong>
         * <p>50075069</p>
         */
        @NameInMap("IspId")
        public String ispId;

        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>14151892****7022</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <strong>example:</strong>
         * <p>230</p>
         */
        @NameInMap("OutBytes")
        public String outBytes;

        /**
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("OutPackets")
        public String outPackets;

        /**
         * <strong>example:</strong>
         * <p>355</p>
         */
        @NameInMap("PacketBytes")
        public Long packetBytes;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("PacketCount")
        public Long packetCount;

        /**
         * <strong>example:</strong>
         * <p>172.21.234.XXX</p>
         */
        @NameInMap("PrivateIp")
        public String privateIp;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("PrivatePort")
        public Integer privatePort;

        /**
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <strong>example:</strong>
         * <p>00000000-0000-0000-0000-000000000000</p>
         */
        @NameInMap("RuleId")
        public String ruleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("RuleName")
        public String ruleName;

        /**
         * <strong>example:</strong>
         * <p>pass</p>
         */
        @NameInMap("RuleResult")
        public Integer ruleResult;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RuleSource")
        public String ruleSource;

        @NameInMap("Rules")
        public java.util.List<DescribeTrafficLogResponseBodyDataListRules> rules;

        /**
         * <strong>example:</strong>
         * <p>1.1.1.1</p>
         */
        @NameInMap("SrcIP")
        public String srcIP;

        /**
         * <strong>example:</strong>
         * <p>20206</p>
         */
        @NameInMap("SrcPort")
        public Integer srcPort;

        /**
         * <strong>example:</strong>
         * <p>172.16.101.7</p>
         */
        @NameInMap("SrcPrivateIP")
        public String srcPrivateIP;

        @NameInMap("SrcVpc")
        public DescribeTrafficLogResponseBodyDataListSrcVpc srcVpc;

        /**
         * <strong>example:</strong>
         * <p>1751423362</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>tir-xxx</p>
         */
        @NameInMap("TlsRuleId")
        public String tlsRuleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TlsRuleName")
        public String tlsRuleName;

        /**
         * <strong>example:</strong>
         * <p>tls-xxx</p>
         */
        @NameInMap("TlsScopeId")
        public String tlsScopeId;

        /**
         * <strong>example:</strong>
         * <p>vfw-4045ca7***</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
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
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CurrentPage")
        public Integer currentPage;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
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
