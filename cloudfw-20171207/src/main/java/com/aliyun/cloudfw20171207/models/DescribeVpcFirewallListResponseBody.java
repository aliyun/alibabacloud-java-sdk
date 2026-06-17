// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125k8g2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of VPC firewalls.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The details of the VPC firewalls.</p>
     */
    @NameInMap("VpcFirewalls")
    public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewalls> vpcFirewalls;

    public static DescribeVpcFirewallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallListResponseBody self = new DescribeVpcFirewallListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcFirewallListResponseBody setVpcFirewalls(java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewalls> vpcFirewalls) {
        this.vpcFirewalls = vpcFirewalls;
        return this;
    }
    public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewalls> getVpcFirewalls() {
        return this.vpcFirewalls;
    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig extends TeaModel {
        /**
         * <p>Indicates whether to enable strict mode. Valid values:</p>
         * <ul>
         * <li><p>1: enabled</p>
         * </li>
         * <li><p>0: disabled</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StrictMode")
        public Integer strictMode;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig self = new DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig setStrictMode(Integer strictMode) {
            this.strictMode = strictMode;
            return this;
        }
        public Integer getStrictMode() {
            return this.strictMode;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig extends TeaModel {
        /**
         * <p>The status of the basic policies. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BasicRules")
        public Integer basicRules;

        /**
         * <p>The status of virtual patching. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        /**
         * <p>The IPS rule group. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Loose.</p>
         * </li>
         * <li><p><strong>2</strong>: Medium.</p>
         * </li>
         * <li><p><strong>3</strong>: Strict.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RuleClass")
        public Integer ruleClass;

        /**
         * <p>The IPS mode. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Block Mode.</p>
         * </li>
         * <li><p><strong>0</strong>: Monitor mode.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RunMode")
        public Integer runMode;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig self = new DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig setBasicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }
        public Integer getBasicRules() {
            return this.basicRules;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig setEnableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
            return this;
        }
        public Integer getEnableAllPatch() {
            return this.enableAllPatch;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig setRuleClass(Integer ruleClass) {
            this.ruleClass = ruleClass;
            return this;
        }
        public Integer getRuleClass() {
            return this.ruleClass;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The ID of the next hop instance for the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList extends TeaModel {
        /**
         * <p>The route entries of the local VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The ID of the route table for the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1234</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList self = new DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc extends TeaModel {
        /**
         * <p>The authorization status of the local VPC. The value is fixed as authorized.</p>
         * 
         * <strong>example:</strong>
         * <p>authorized</p>
         */
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        /**
         * <p>The UID of the Alibaba Cloud account to which the local VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The CIDR blocks of the local VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList;

        /**
         * <p>The instance ID of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The instance name of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>test-vpc1</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc self = new DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The ID of the next hop instance for the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList extends TeaModel {
        /**
         * <p>The route entries of the peer VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The ID of the route table for the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1256</p>
         */
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList self = new DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc extends TeaModel {
        /**
         * <p>The authorization status of the peer VPC. The value is fixed as <strong>authorized</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>authorized</p>
         */
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        /**
         * <p>The UID of the Alibaba Cloud account to which the peer VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>The region ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The CIDR blocks of the peer VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList> vpcCidrTableList;

        /**
         * <p>The instance ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The instance name of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>test-vpc2</p>
         */
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc self = new DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewalls extends TeaModel {
        /**
         * <p>The mode of the access control list (ACL) engine.</p>
         */
        @NameInMap("AclConfig")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig aclConfig;

        /**
         * <p>The bandwidth of the Express Connect circuit. Unit: Mbps.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        /**
         * <p>The subtype of the connection. Valid values:</p>
         * <ul>
         * <li><p><strong>vpc2vpc</strong>: Express Connect.</p>
         * </li>
         * <li><p><strong>vpcpeer</strong>: peering connection.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>vpcpeer</p>
         */
        @NameInMap("ConnectSubType")
        public String connectSubType;

        /**
         * <p>The type of connection for the VPC firewall. The value is fixed as <strong>expressconnect</strong>, which indicates an Express Connect circuit.</p>
         * 
         * <strong>example:</strong>
         * <p>expressconnect</p>
         */
        @NameInMap("ConnectType")
        public String connectType;

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <ul>
         * <li><p><strong>opened</strong>: The firewall is enabled.</p>
         * </li>
         * <li><p><strong>closed</strong>: The firewall is disabled.</p>
         * </li>
         * <li><p><strong>notconfigured</strong>: The firewall is not configured.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>opened</p>
         */
        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        /**
         * <p>The configuration of the intrusion prevention system (IPS).</p>
         */
        @NameInMap("IpsConfig")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig ipsConfig;

        /**
         * <p>The details of the local VPC.</p>
         */
        @NameInMap("LocalVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc localVpc;

        /**
         * <p>The UID of the member account.</p>
         * 
         * <strong>example:</strong>
         * <p>258039427902****</p>
         */
        @NameInMap("MemberUid")
        public String memberUid;

        /**
         * <p>The details of the peer VPC.</p>
         */
        @NameInMap("PeerVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc peerVpc;

        /**
         * <p>The status of the region. Valid values:</p>
         * <ul>
         * <li><p><strong>enable</strong>: The region is available. You can create a VPC firewall in this region.</p>
         * </li>
         * <li><p><strong>disable</strong>: The region is unavailable. You cannot create a VPC firewall in this region.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The result code of the VPC firewall creation. Valid values:</p>
         * <ul>
         * <li><p><strong>Unauthorized</strong>: An unauthorized VPC exists. You cannot create a VPC firewall.</p>
         * </li>
         * <li><p><strong>RegionDisable</strong>: The VPC is in a region where VPC firewalls are not supported. You cannot create a VPC firewall.</p>
         * </li>
         * <li><p><strong>An empty string</strong>: You can create a VPC firewall for the network instance.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Unauthorized</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The instance ID of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>vfw-m5e7dbc4y****</p>
         */
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        /**
         * <p>The instance name of the VPC firewall.</p>
         * 
         * <strong>example:</strong>
         * <p>test-firewall</p>
         */
        @NameInMap("VpcFirewallName")
        public String vpcFirewallName;

        public static DescribeVpcFirewallListResponseBodyVpcFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewalls self = new DescribeVpcFirewallListResponseBodyVpcFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setAclConfig(DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig aclConfig) {
            this.aclConfig = aclConfig;
            return this;
        }
        public DescribeVpcFirewallListResponseBodyVpcFirewallsAclConfig getAclConfig() {
            return this.aclConfig;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setBandwidth(Integer bandwidth) {
            this.bandwidth = bandwidth;
            return this;
        }
        public Integer getBandwidth() {
            return this.bandwidth;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setConnectSubType(String connectSubType) {
            this.connectSubType = connectSubType;
            return this;
        }
        public String getConnectSubType() {
            return this.connectSubType;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setFirewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }
        public String getFirewallSwitchStatus() {
            return this.firewallSwitchStatus;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setIpsConfig(DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig ipsConfig) {
            this.ipsConfig = ipsConfig;
            return this;
        }
        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig getIpsConfig() {
            return this.ipsConfig;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setLocalVpc(DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc localVpc) {
            this.localVpc = localVpc;
            return this;
        }
        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc getLocalVpc() {
            return this.localVpc;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setPeerVpc(DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc peerVpc) {
            this.peerVpc = peerVpc;
            return this;
        }
        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc getPeerVpc() {
            return this.peerVpc;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeVpcFirewallListResponseBodyVpcFirewalls setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
