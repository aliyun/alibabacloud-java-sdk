// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrafficLogRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>00000000-0000-0000-0000-000000000000</p>
     */
    @NameInMap("AclPreRuleId")
    public String aclPreRuleId;

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
     * <p>7</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("AssetRegion")
    public String assetRegion;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AttackType")
    public String attackType;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public String currentPage;

    /**
     * <strong>example:</strong>
     * <p>out</p>
     */
    @NameInMap("Direction")
    public String direction;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainUrl")
    public String domainUrl;

    /**
     * <strong>example:</strong>
     * <p>182.92.206.XXX</p>
     */
    @NameInMap("DstIP")
    public String dstIP;

    /**
     * <strong>example:</strong>
     * <p>9876</p>
     */
    @NameInMap("DstPort")
    public String dstPort;

    /**
     * <strong>example:</strong>
     * <p>vpc-wz95m1aq9b0h****vk1yb</p>
     */
    @NameInMap("DstVpcId")
    public String dstVpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-shenzhen</p>
     */
    @NameInMap("DstVpcRegionNo")
    public String dstVpcRegionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1742926322</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>VpcFirewall</p>
     */
    @NameInMap("FirewallType")
    public String firewallType;

    /**
     * <strong>example:</strong>
     * <p>All</p>
     */
    @NameInMap("FlowType")
    public String flowType;

    /**
     * <strong>example:</strong>
     * <p>icmp</p>
     */
    @NameInMap("IpProtocol")
    public String ipProtocol;

    /**
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("IpVersion")
    public String ipVersion;

    @NameInMap("Isp")
    public String isp;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    @NameInMap("Location")
    public String location;

    /**
     * <strong>example:</strong>
     * <p>128599825273****</p>
     */
    @NameInMap("MemberUid")
    public Long memberUid;

    /**
     * <strong>example:</strong>
     * <p>vfw-tr-7a9c8901ed394****</p>
     */
    @NameInMap("NatFirewallId")
    public String natFirewallId;

    /**
     * <strong>example:</strong>
     * <p>ngw-2zew6yn017hhzbm****</p>
     */
    @NameInMap("NatGatewayId")
    public String natGatewayId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <strong>example:</strong>
     * <p>8b115ae3-da64-4b80-81c1-1cd2dd42****</p>
     */
    @NameInMap("RuleId")
    public String ruleId;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("RuleResult")
    public String ruleResult;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RuleSource")
    public String ruleSource;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>yundun</p>
     */
    @NameInMap("SourceCode")
    public String sourceCode;

    /**
     * <strong>example:</strong>
     * <p>139.217.234.XXX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <strong>example:</strong>
     * <p>10.68.60.XXX</p>
     */
    @NameInMap("SrcIP")
    public String srcIP;

    /**
     * <strong>example:</strong>
     * <p>8082</p>
     */
    @NameInMap("SrcPort")
    public String srcPort;

    /**
     * <strong>example:</strong>
     * <p>10.100.134.XX</p>
     */
    @NameInMap("SrcPrivateIP")
    public String srcPrivateIP;

    /**
     * <strong>example:</strong>
     * <p>vpc-wz9309pkwe06lv****tk4</p>
     */
    @NameInMap("SrcVpcId")
    public String srcVpcId;

    /**
     * <strong>example:</strong>
     * <p>cn-beijing</p>
     */
    @NameInMap("SrcVpcRegionNo")
    public String srcVpcRegionNo;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1730946241</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <strong>example:</strong>
     * <p>tis-98fd64c5****</p>
     */
    @NameInMap("TlsScopeId")
    public String tlsScopeId;

    /**
     * <strong>example:</strong>
     * <p>vfw-a42bbb7b887148c9****</p>
     */
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("VulLevel")
    public String vulLevel;

    public static DescribeTrafficLogRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrafficLogRequest self = new DescribeTrafficLogRequest();
        return TeaModel.build(map, self);
    }

    public DescribeTrafficLogRequest setAclPreRuleId(String aclPreRuleId) {
        this.aclPreRuleId = aclPreRuleId;
        return this;
    }
    public String getAclPreRuleId() {
        return this.aclPreRuleId;
    }

    public DescribeTrafficLogRequest setAclPreState(String aclPreState) {
        this.aclPreState = aclPreState;
        return this;
    }
    public String getAclPreState() {
        return this.aclPreState;
    }

    public DescribeTrafficLogRequest setAppDpiState(String appDpiState) {
        this.appDpiState = appDpiState;
        return this;
    }
    public String getAppDpiState() {
        return this.appDpiState;
    }

    public DescribeTrafficLogRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DescribeTrafficLogRequest setAssetRegion(String assetRegion) {
        this.assetRegion = assetRegion;
        return this;
    }
    public String getAssetRegion() {
        return this.assetRegion;
    }

    public DescribeTrafficLogRequest setAttackType(String attackType) {
        this.attackType = attackType;
        return this;
    }
    public String getAttackType() {
        return this.attackType;
    }

    public DescribeTrafficLogRequest setCurrentPage(String currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public String getCurrentPage() {
        return this.currentPage;
    }

    public DescribeTrafficLogRequest setDirection(String direction) {
        this.direction = direction;
        return this;
    }
    public String getDirection() {
        return this.direction;
    }

    public DescribeTrafficLogRequest setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public DescribeTrafficLogRequest setDomainUrl(String domainUrl) {
        this.domainUrl = domainUrl;
        return this;
    }
    public String getDomainUrl() {
        return this.domainUrl;
    }

    public DescribeTrafficLogRequest setDstIP(String dstIP) {
        this.dstIP = dstIP;
        return this;
    }
    public String getDstIP() {
        return this.dstIP;
    }

    public DescribeTrafficLogRequest setDstPort(String dstPort) {
        this.dstPort = dstPort;
        return this;
    }
    public String getDstPort() {
        return this.dstPort;
    }

    public DescribeTrafficLogRequest setDstVpcId(String dstVpcId) {
        this.dstVpcId = dstVpcId;
        return this;
    }
    public String getDstVpcId() {
        return this.dstVpcId;
    }

    public DescribeTrafficLogRequest setDstVpcRegionNo(String dstVpcRegionNo) {
        this.dstVpcRegionNo = dstVpcRegionNo;
        return this;
    }
    public String getDstVpcRegionNo() {
        return this.dstVpcRegionNo;
    }

    public DescribeTrafficLogRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeTrafficLogRequest setFirewallType(String firewallType) {
        this.firewallType = firewallType;
        return this;
    }
    public String getFirewallType() {
        return this.firewallType;
    }

    public DescribeTrafficLogRequest setFlowType(String flowType) {
        this.flowType = flowType;
        return this;
    }
    public String getFlowType() {
        return this.flowType;
    }

    public DescribeTrafficLogRequest setIpProtocol(String ipProtocol) {
        this.ipProtocol = ipProtocol;
        return this;
    }
    public String getIpProtocol() {
        return this.ipProtocol;
    }

    public DescribeTrafficLogRequest setIpVersion(String ipVersion) {
        this.ipVersion = ipVersion;
        return this;
    }
    public String getIpVersion() {
        return this.ipVersion;
    }

    public DescribeTrafficLogRequest setIsp(String isp) {
        this.isp = isp;
        return this;
    }
    public String getIsp() {
        return this.isp;
    }

    public DescribeTrafficLogRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeTrafficLogRequest setLocation(String location) {
        this.location = location;
        return this;
    }
    public String getLocation() {
        return this.location;
    }

    public DescribeTrafficLogRequest setMemberUid(Long memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public Long getMemberUid() {
        return this.memberUid;
    }

    public DescribeTrafficLogRequest setNatFirewallId(String natFirewallId) {
        this.natFirewallId = natFirewallId;
        return this;
    }
    public String getNatFirewallId() {
        return this.natFirewallId;
    }

    public DescribeTrafficLogRequest setNatGatewayId(String natGatewayId) {
        this.natGatewayId = natGatewayId;
        return this;
    }
    public String getNatGatewayId() {
        return this.natGatewayId;
    }

    public DescribeTrafficLogRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeTrafficLogRequest setRuleId(String ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public String getRuleId() {
        return this.ruleId;
    }

    public DescribeTrafficLogRequest setRuleResult(String ruleResult) {
        this.ruleResult = ruleResult;
        return this;
    }
    public String getRuleResult() {
        return this.ruleResult;
    }

    public DescribeTrafficLogRequest setRuleSource(String ruleSource) {
        this.ruleSource = ruleSource;
        return this;
    }
    public String getRuleSource() {
        return this.ruleSource;
    }

    public DescribeTrafficLogRequest setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
        return this;
    }
    public String getSourceCode() {
        return this.sourceCode;
    }

    public DescribeTrafficLogRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public DescribeTrafficLogRequest setSrcIP(String srcIP) {
        this.srcIP = srcIP;
        return this;
    }
    public String getSrcIP() {
        return this.srcIP;
    }

    public DescribeTrafficLogRequest setSrcPort(String srcPort) {
        this.srcPort = srcPort;
        return this;
    }
    public String getSrcPort() {
        return this.srcPort;
    }

    public DescribeTrafficLogRequest setSrcPrivateIP(String srcPrivateIP) {
        this.srcPrivateIP = srcPrivateIP;
        return this;
    }
    public String getSrcPrivateIP() {
        return this.srcPrivateIP;
    }

    public DescribeTrafficLogRequest setSrcVpcId(String srcVpcId) {
        this.srcVpcId = srcVpcId;
        return this;
    }
    public String getSrcVpcId() {
        return this.srcVpcId;
    }

    public DescribeTrafficLogRequest setSrcVpcRegionNo(String srcVpcRegionNo) {
        this.srcVpcRegionNo = srcVpcRegionNo;
        return this;
    }
    public String getSrcVpcRegionNo() {
        return this.srcVpcRegionNo;
    }

    public DescribeTrafficLogRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeTrafficLogRequest setTlsScopeId(String tlsScopeId) {
        this.tlsScopeId = tlsScopeId;
        return this;
    }
    public String getTlsScopeId() {
        return this.tlsScopeId;
    }

    public DescribeTrafficLogRequest setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public DescribeTrafficLogRequest setVulLevel(String vulLevel) {
        this.vulLevel = vulLevel;
        return this;
    }
    public String getVulLevel() {
        return this.vulLevel;
    }

}
