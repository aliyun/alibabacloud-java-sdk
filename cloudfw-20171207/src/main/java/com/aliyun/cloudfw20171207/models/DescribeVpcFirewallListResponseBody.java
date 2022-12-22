// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of VPC firewalls.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // The details about VPC firewalls.
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

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig extends TeaModel {
        // The status of basic policies. Valid values:
        // 
        // - **1**: enabled
        // - **0**: disabled
        @NameInMap("BasicRules")
        public Integer basicRules;

        // The status of virtual patches. Valid values:
        // 
        // - **1**: enabled
        // - **0**: disabled
        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        // The working mode of the IPS. Valid values:
        // 
        // - **1**: blocking mode
        // - **0**: monitoring mode
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

        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

    }

    public static class DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        // The destination CIDR block of the local VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID of the next hop for the local VPC.
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
        // The route entries of the local VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The ID of the route table for the local VPC.
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
        // Indicates whether Cloud Firewall is authorized to access the local VPC. The value is fixed as authorized, which indicates that Cloud Firewall is authorized to access the local VPC.
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        // The UID of the Alibaba Cloud account to which the local VPC belongs.
        @NameInMap("OwnerId")
        public Long ownerId;

        // The region ID of the local VPC.
        @NameInMap("RegionNo")
        public String regionNo;

        // The CIDR blocks of the local VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the local VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the local VPC.
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
        // The destination CIDR block of the peer VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID of the next hop for the peer VPC.
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
        // The route entries of the peer VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The ID of the route table for the peer VPC.
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
        // Indicates whether Cloud Firewall is authorized to access the peer VPC. The value is fixed as **authorized**, which indicates that Cloud Firewall is authorized to access the peer VPC.
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        // The UID of the Alibaba Cloud account to which the peer VPC belongs.
        @NameInMap("OwnerId")
        public Long ownerId;

        // The region ID of the peer VPC.
        @NameInMap("RegionNo")
        public String regionNo;

        // The CIDR blocks of the peer VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the peer VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the peer VPC.
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
        // The bandwidth of the Express Connect circuit. Unit: Mbit/s.
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        // The sub type of connection. Valid values:
        // 
        // - **vpc2vpc**: High-speed channel.
        // - **vppeer**: Peer connection.
        @NameInMap("ConnectSubType")
        public String connectSubType;

        // The connection type of the VPC firewall. The value is fixed as **expressconnect**, which indicates Express Connect circuits.
        @NameInMap("ConnectType")
        public String connectType;

        // The status of the VPC firewall. Valid values:
        // 
        // *   **opened**: The VPC firewall is enabled.
        // *   **closed**: The VPC firewall is disabled.
        // *   **notconfigured**: The VPC firewall is not configured.
        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        // The configuration of the intrusion prevention system (IPS).
        @NameInMap("IpsConfig")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig ipsConfig;

        // The details about the local VPC.
        @NameInMap("LocalVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc localVpc;

        // The UID of the member that is managed by your Alibaba Cloud account.
        @NameInMap("MemberUid")
        public String memberUid;

        // The details about the peer VPC.
        @NameInMap("PeerVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc peerVpc;

        // The status of the region. Valid values:
        // 
        // *   **enable**: indicates that you can create VPC firewalls in the region.
        // *   **disable**: indicates that you cannot create VPC firewalls in the region.
        @NameInMap("RegionStatus")
        public String regionStatus;

        // The result code of the operation that creates the VPC firewall. Valid values:
        // 
        // *   **Unauthorized**: Cloud Firewall is not authorized to access the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
        // *   **RegionDisable**: .VPC Firewall is not supported in the region of the VPC for which the VPC firewall is created, and the VPC firewall cannot be created.
        // *   **OpsDisable**: You are not allowed to create the VPC firewall.
        // *   **VbrNotSupport**: The VPC firewall cannot be created for a VBR that is attached to the CEN instance.
        // *   Empty string: You can create a VPC firewall for the network instance.
        @NameInMap("ResultCode")
        public String resultCode;

        // The instance ID of the VPC firewall.
        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

        // The instance name of the VPC firewall.
        @NameInMap("VpcFirewallName")
        public String vpcFirewallName;

        public static DescribeVpcFirewallListResponseBodyVpcFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallListResponseBodyVpcFirewalls self = new DescribeVpcFirewallListResponseBodyVpcFirewalls();
            return TeaModel.build(map, self);
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
