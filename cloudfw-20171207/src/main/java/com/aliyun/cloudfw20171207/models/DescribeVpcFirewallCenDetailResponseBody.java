// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailResponseBody extends TeaModel {
    // The connection type of the VPC firewall. The value is fixed as **cen**, which indicates CEN instances.
    @NameInMap("ConnectType")
    public String connectType;

    // The status of the VPC firewall. Valid values:
    // 
    // *   **opened**: enabled
    // *   **closed**: disabled
    // *   **notconfigured**: not configured
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    // The details about the VPC.
    @NameInMap("LocalVpc")
    public DescribeVpcFirewallCenDetailResponseBodyLocalVpc localVpc;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The instance ID of the VPC firewall.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    // The instance name of the VPC firewall.
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static DescribeVpcFirewallCenDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallCenDetailResponseBody self = new DescribeVpcFirewallCenDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallCenDetailResponseBody setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public DescribeVpcFirewallCenDetailResponseBody setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeVpcFirewallCenDetailResponseBody setLocalVpc(DescribeVpcFirewallCenDetailResponseBodyLocalVpc localVpc) {
        this.localVpc = localVpc;
        return this;
    }
    public DescribeVpcFirewallCenDetailResponseBodyLocalVpc getLocalVpc() {
        return this.localVpc;
    }

    public DescribeVpcFirewallCenDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallCenDetailResponseBody setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public DescribeVpcFirewallCenDetailResponseBody setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList extends TeaModel {
        // The ID of the ENI that belongs to the VPC.
        @NameInMap("EniId")
        public String eniId;

        // The private IP address of the ENI that belongs to the VPC.
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        public static DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList self = new DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList setEniPrivateIpAddress(String eniPrivateIpAddress) {
            this.eniPrivateIpAddress = eniPrivateIpAddress;
            return this;
        }
        public String getEniPrivateIpAddress() {
            return this.eniPrivateIpAddress;
        }

    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        // The destination CIDR block of the VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID of the next hop for the VPC.
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList extends TeaModel {
        // The route entries of the VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The ID of the route table for the VPC.
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList self = new DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpc extends TeaModel {
        // The ID of the connection between two network instances.
        @NameInMap("AttachmentId")
        public String attachmentId;

        // The name of the connection between two network instances.
        @NameInMap("AttachmentName")
        public String attachmentName;

        // The CIDR blocks that are protected by the VPC firewall.
        @NameInMap("DefendCidrList")
        public java.util.List<String> defendCidrList;

        // The Elastic Network Interfaces (ENIs).
        @NameInMap("EniList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList> eniList;

        // The ID of the vSwitch. The value of this parameter is returned only when the RouteMode parameter is set to manual.
        @NameInMap("ManualVSwitchId")
        public String manualVSwitchId;

        // The ID of the VPC for which the VPC firewall is created.
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        // The name of the network instance.
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        // The type of the network instance. The value is fixed as **VPC**.
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        // The UID of the Alibaba Cloud account to which the VPC belongs.
        @NameInMap("OwnerId")
        public String ownerId;

        // The ID of the region in which the VPC resides.
        @NameInMap("RegionNo")
        public String regionNo;

        // The routing mode. Valid values:
        // 
        // *   auto
        // *   manual
        @NameInMap("RouteMode")
        public String routeMode;

        // Indicates whether the routing mode can be set to manual. Valid values:
        // 
        // *   **1**: yes
        // *   **0**: no
        @NameInMap("SupportManualMode")
        public String supportManualMode;

        // The instance ID of the CEN transit router.
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        // The edition of the CEN transit router. Valid values:
        // 
        // *   **Basic**: Basic Edition
        // *   **Enterprise**: Enterprise Edition
        @NameInMap("TransitRouterType")
        public String transitRouterType;

        // The CIDR blocks of the VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the VPC.
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallCenDetailResponseBodyLocalVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenDetailResponseBodyLocalVpc self = new DescribeVpcFirewallCenDetailResponseBodyLocalVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setAttachmentId(String attachmentId) {
            this.attachmentId = attachmentId;
            return this;
        }
        public String getAttachmentId() {
            return this.attachmentId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setAttachmentName(String attachmentName) {
            this.attachmentName = attachmentName;
            return this;
        }
        public String getAttachmentName() {
            return this.attachmentName;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setDefendCidrList(java.util.List<String> defendCidrList) {
            this.defendCidrList = defendCidrList;
            return this;
        }
        public java.util.List<String> getDefendCidrList() {
            return this.defendCidrList;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setEniList(java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList> eniList) {
            this.eniList = eniList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList> getEniList() {
            return this.eniList;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setManualVSwitchId(String manualVSwitchId) {
            this.manualVSwitchId = manualVSwitchId;
            return this;
        }
        public String getManualVSwitchId() {
            return this.manualVSwitchId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setNetworkInstanceId(String networkInstanceId) {
            this.networkInstanceId = networkInstanceId;
            return this;
        }
        public String getNetworkInstanceId() {
            return this.networkInstanceId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setNetworkInstanceName(String networkInstanceName) {
            this.networkInstanceName = networkInstanceName;
            return this;
        }
        public String getNetworkInstanceName() {
            return this.networkInstanceName;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setNetworkInstanceType(String networkInstanceType) {
            this.networkInstanceType = networkInstanceType;
            return this;
        }
        public String getNetworkInstanceType() {
            return this.networkInstanceType;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setOwnerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public String getOwnerId() {
            return this.ownerId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setRouteMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }
        public String getRouteMode() {
            return this.routeMode;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setSupportManualMode(String supportManualMode) {
            this.supportManualMode = supportManualMode;
            return this;
        }
        public String getSupportManualMode() {
            return this.supportManualMode;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setTransitRouterType(String transitRouterType) {
            this.transitRouterType = transitRouterType;
            return this;
        }
        public String getTransitRouterType() {
            return this.transitRouterType;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
