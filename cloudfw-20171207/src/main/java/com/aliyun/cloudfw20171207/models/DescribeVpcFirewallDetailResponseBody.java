// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDetailResponseBody extends TeaModel {
    // The bandwidth of the Express Connect circuit. Unit: Mbit/s.
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    // The connection type of the VPC firewall. The value is fixed as **expressconnect**, which indicates Express Connect circuits.
    @NameInMap("ConnectType")
    public String connectType;

    // The status of the VPC firewall. Valid values:
    // 
    // *   **opened**: The VPC firewall is enabled.
    // *   **closed**: The VPC firewall is disabled.
    // *   **notconfigured**: The VPC firewall is not configured.
    // *   **configured**: The VPC firewall is configured.
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    // The details about the local VPC.
    @NameInMap("LocalVpc")
    public DescribeVpcFirewallDetailResponseBodyLocalVpc localVpc;

    // The UID of the member that is managed by your Alibaba Cloud account.
    @NameInMap("MemberUid")
    public String memberUid;

    // The details about the peer VPC.
    @NameInMap("PeerVpc")
    public DescribeVpcFirewallDetailResponseBodyPeerVpc peerVpc;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The instance ID of the VPC firewall.
    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

    // The instance name of the VPC firewall.
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    public static DescribeVpcFirewallDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVpcFirewallDetailResponseBody self = new DescribeVpcFirewallDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVpcFirewallDetailResponseBody setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public DescribeVpcFirewallDetailResponseBody setConnectType(String connectType) {
        this.connectType = connectType;
        return this;
    }
    public String getConnectType() {
        return this.connectType;
    }

    public DescribeVpcFirewallDetailResponseBody setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeVpcFirewallDetailResponseBody setLocalVpc(DescribeVpcFirewallDetailResponseBodyLocalVpc localVpc) {
        this.localVpc = localVpc;
        return this;
    }
    public DescribeVpcFirewallDetailResponseBodyLocalVpc getLocalVpc() {
        return this.localVpc;
    }

    public DescribeVpcFirewallDetailResponseBody setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public DescribeVpcFirewallDetailResponseBody setPeerVpc(DescribeVpcFirewallDetailResponseBodyPeerVpc peerVpc) {
        this.peerVpc = peerVpc;
        return this;
    }
    public DescribeVpcFirewallDetailResponseBodyPeerVpc getPeerVpc() {
        return this.peerVpc;
    }

    public DescribeVpcFirewallDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVpcFirewallDetailResponseBody setVpcFirewallId(String vpcFirewallId) {
        this.vpcFirewallId = vpcFirewallId;
        return this;
    }
    public String getVpcFirewallId() {
        return this.vpcFirewallId;
    }

    public DescribeVpcFirewallDetailResponseBody setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public static class DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        // The destination CIDR block of the local VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID of the next hop for the local VPC.
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList extends TeaModel {
        // The route entries of the local VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The ID of the route table for the local VPC.
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList self = new DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallDetailResponseBodyLocalVpc extends TeaModel {
        // The ID of the ENI for the local VPC.
        @NameInMap("EniId")
        public String eniId;

        // The private IP address of the elastic network interface (ENI) for the local VPC.
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        // The region ID of the local VPC.
        @NameInMap("RegionNo")
        public String regionNo;

        // The router interface ID of the local VPC.
        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        // The CIDR blocks of the local VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the local VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the local VPC.
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallDetailResponseBodyLocalVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyLocalVpc self = new DescribeVpcFirewallDetailResponseBodyLocalVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setEniPrivateIpAddress(String eniPrivateIpAddress) {
            this.eniPrivateIpAddress = eniPrivateIpAddress;
            return this;
        }
        public String getEniPrivateIpAddress() {
            return this.eniPrivateIpAddress;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setRouterInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallDetailResponseBodyLocalVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

    public static class DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList extends TeaModel {
        // The destination CIDR block of the peer VPC.
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        // The instance ID of the next hop for the peer VPC.
        @NameInMap("NextHopInstanceId")
        public String nextHopInstanceId;

        public static DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList self = new DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList setDestinationCidr(String destinationCidr) {
            this.destinationCidr = destinationCidr;
            return this;
        }
        public String getDestinationCidr() {
            return this.destinationCidr;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList setNextHopInstanceId(String nextHopInstanceId) {
            this.nextHopInstanceId = nextHopInstanceId;
            return this;
        }
        public String getNextHopInstanceId() {
            return this.nextHopInstanceId;
        }

    }

    public static class DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList extends TeaModel {
        // The route entries of the peer VPC.
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList> routeEntryList;

        // The ID of the route table for the peer VPC.
        @NameInMap("RouteTableId")
        public String routeTableId;

        public static DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList self = new DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList setRouteEntryList(java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList> routeEntryList) {
            this.routeEntryList = routeEntryList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList> getRouteEntryList() {
            return this.routeEntryList;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList setRouteTableId(String routeTableId) {
            this.routeTableId = routeTableId;
            return this;
        }
        public String getRouteTableId() {
            return this.routeTableId;
        }

    }

    public static class DescribeVpcFirewallDetailResponseBodyPeerVpc extends TeaModel {
        // The ID of the ENI for the peer VPC.
        @NameInMap("EniId")
        public String eniId;

        // The private IP address of the ENI for the peer VPC.
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        // The region ID of the peer VPC.
        @NameInMap("RegionNo")
        public String regionNo;

        // The router interface ID of the peer VPC.
        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        // The CIDR blocks of the peer VPC.
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList> vpcCidrTableList;

        // The ID of the peer VPC.
        @NameInMap("VpcId")
        public String vpcId;

        // The name of the peer VPC.
        @NameInMap("VpcName")
        public String vpcName;

        public static DescribeVpcFirewallDetailResponseBodyPeerVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallDetailResponseBodyPeerVpc self = new DescribeVpcFirewallDetailResponseBodyPeerVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setEniId(String eniId) {
            this.eniId = eniId;
            return this;
        }
        public String getEniId() {
            return this.eniId;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setEniPrivateIpAddress(String eniPrivateIpAddress) {
            this.eniPrivateIpAddress = eniPrivateIpAddress;
            return this;
        }
        public String getEniPrivateIpAddress() {
            return this.eniPrivateIpAddress;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setRouterInterfaceId(String routerInterfaceId) {
            this.routerInterfaceId = routerInterfaceId;
            return this;
        }
        public String getRouterInterfaceId() {
            return this.routerInterfaceId;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setVpcCidrTableList(java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList> vpcCidrTableList) {
            this.vpcCidrTableList = vpcCidrTableList;
            return this;
        }
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList> getVpcCidrTableList() {
            return this.vpcCidrTableList;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallDetailResponseBodyPeerVpc setVpcName(String vpcName) {
            this.vpcName = vpcName;
            return this;
        }
        public String getVpcName() {
            return this.vpcName;
        }

    }

}
