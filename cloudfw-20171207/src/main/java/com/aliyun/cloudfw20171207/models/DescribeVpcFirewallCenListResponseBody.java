// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenListResponseBody extends TeaModel {
    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of VPC firewalls.
    @NameInMap("TotalCount")
    public Integer totalCount;

    // The details about the VPC firewall.
    @NameInMap("VpcFirewalls")
    public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> vpcFirewalls;

    public static DescribeVpcFirewallCenListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenListResponseBody self = new DescribeVpcFirewallCenListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallCenListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public DescribeVpcFirewallCenListResponseBody setVpcFirewalls(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> vpcFirewalls) {
        this.vpcFirewalls = vpcFirewalls;
        return this;
    }
    public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewalls> getVpcFirewalls() {
        return this.vpcFirewalls;
    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig extends TeaModel {
        // Indicates whether basic protection is enabled. Valid values:
        // 
        // - **1**: yes
        // - **0**: no
        @NameInMap("BasicRules")
        public Integer basicRules;

        // Indicates whether virtual patching is enabled. Valid values:
        // 
        // - **1**: yes
        // - **0**: no
        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        // The mode of the IPS. Valid values:
        // 
        // - **1**: block mode
        // - **0**: monitor mode
        @NameInMap("RunMode")
        public Integer runMode;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setBasicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }
        public Integer getBasicRules() {
            return this.basicRules;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setEnableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
            return this;
        }
        public Integer getEnableAllPatch() {
            return this.enableAllPatch;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        // The destination CIDR block of the VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID for the next hop of the VPC.
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList extends TeaModel {
        // The route entries for the VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The route table ID of the VPC.
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc extends TeaModel {
        // Indicates whether the VPC is granted the required permissions. The value is fixed as **authorized**, which indicates that the VPC is granted the required permissions.
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        // The CIDR blocks that are protected by the VPC firewall.
        @NameInMap("DefendCidrList")
        public java.util.List<String> defendCidrList;

        // The ID of the specified vSwitch when the routing mode is manual.
        @NameInMap("ManualVSwitchId")
        public String manualVSwitchId;

        // The ID of the network instance.
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        // The name of the network instance.
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        // The type of the network instance. Valid values:
        // 
        // *   **VPC**
        // *   **VBR**
        // *   **CCN**
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        // The ID of the Alibaba Cloud account to which the VPC belongs.
        @NameInMap("OwnerId")
        public Long ownerId;

        // The region ID of the VPC.
        @NameInMap("RegionNo")
        public String regionNo;

        // The routing mode of the VPC firewall. Valid values:
        // 
        // *   **auto**: automatic mode
        // *   **manual**: manual mode
        @NameInMap("RouteMode")
        public String routeMode;

        // Indicates whether the manual routing mode is supported. Valid values:
        // 
        // *   **1**: yes
        // *   **0**: no
        @NameInMap("SupportManualMode")
        public String supportManualMode;

        // The type of the CEN transit router. Valid values:
        // 
        // *   **Basic**: Basic Edition transit router
        // *   **Enterprise**: Enterprise Edition transit router
        @NameInMap("TransitRouterType")
        public String transitRouterType;

        // The CIDR block of the VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the VPC.
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc self = new DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setAuthorizationStatus(String authorizationStatus) {
            this.authorizationStatus = authorizationStatus;
            return this;
        }
        public String getAuthorizationStatus() {
            return this.authorizationStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setDefendCidrList(java.util.List<String> defendCidrList) {
            this.defendCidrList = defendCidrList;
            return this;
        }
        public java.util.List<String> getDefendCidrList() {
            return this.defendCidrList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setManualVSwitchId(String manualVSwitchId) {
            this.manualVSwitchId = manualVSwitchId;
            return this;
        }
        public String getManualVSwitchId() {
            return this.manualVSwitchId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setRouteMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }
        public String getRouteMode() {
            return this.routeMode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setSupportManualMode(String supportManualMode) {
            this.supportManualMode = supportManualMode;
            return this;
        }
        public String getSupportManualMode() {
            return this.supportManualMode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setTransitRouterType(String transitRouterType) {
            this.transitRouterType = transitRouterType;
            return this;
        }
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcFirewallCenListResponseBodyVpcFirewalls extends TeaModel {
        // The ID of the CEN instance.
        @NameInMap("CenId")
        public String cenId;

        // The name of the CEN instance.
        @NameInMap("CenName")
        public String cenName;

        // The connection type of the VPC firewall. The value is fixed as cen, which indicates a CEN instance.
        @NameInMap("ConnectType")
        public String connectType;

        // The status of the VPC firewall. Valid values:
        // 
        // *   **opened**: The VPC firewall is enabled.
        // *   **closed**: The VPC firewall is disabled.
        // *   **notconfigured**: The VPC firewall is not created.
        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        // The information about the intrusion prevention system (IPS) configuration.
        @NameInMap("IpsConfig")
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig ipsConfig;

        // The details about the VPC.
        @NameInMap("LocalVpc")
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc localVpc;

        // The UID of the member that is manged by your Alibaba Cloud account. The member is also an Alibaba Cloud account.
        @NameInMap("MemberUid")
        public String memberUid;

        // Indicates whether the VPC firewall can be automatically enabled to protect VPC traffic based on route learning. Valid values: 
        // 
        // - **passed**: The VPC firewall can be automatically enabled.
        // - **failed**: The VPC firewall cannot be automatically enabled.
        // - **unknown**: The VPC firewall is in an unknown state.
        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        // Indicates whether you can create a VPC firewall in a region. Valid values:
        // 
        // *   **enable**: yes
        // *   **disable**: no
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

        public static DescribeVpcFirewallCenListResponseBodyVpcFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenListResponseBodyVpcFirewalls self = new DescribeVpcFirewallCenListResponseBodyVpcFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setConnectType(String connectType) {
            this.connectType = connectType;
            return this;
        }
        public String getConnectType() {
            return this.connectType;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setFirewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }
        public String getFirewallSwitchStatus() {
            return this.firewallSwitchStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setIpsConfig(DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig ipsConfig) {
            this.ipsConfig = ipsConfig;
            return this;
        }
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsIpsConfig getIpsConfig() {
            return this.ipsConfig;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setLocalVpc(DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc localVpc) {
            this.localVpc = localVpc;
            return this;
        }
        public DescribeVpcFirewallCenListResponseBodyVpcFirewallsLocalVpc getLocalVpc() {
            return this.localVpc;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setMemberUid(String memberUid) {
            this.memberUid = memberUid;
            return this;
        }
        public String getMemberUid() {
            return this.memberUid;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setPrecheckStatus(String precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setVpcFirewallId(String vpcFirewallId) {
            this.vpcFirewallId = vpcFirewallId;
            return this;
        }
        public String getVpcFirewallId() {
            return this.vpcFirewallId;
        }

        public DescribeVpcFirewallCenListResponseBodyVpcFirewalls setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
