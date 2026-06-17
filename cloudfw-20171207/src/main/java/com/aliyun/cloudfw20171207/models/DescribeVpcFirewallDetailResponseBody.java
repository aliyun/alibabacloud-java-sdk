// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallDetailResponseBody extends TeaModel {
    /**
     * <p>The bandwidth of the Express Connect circuit. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The connection type of the VPC firewall. The value is fixed as <strong>expressconnect</strong>, which indicates Express Connect.</p>
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
     * <li><p><strong>configured</strong>: The firewall is configured.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The details of the local VPC.</p>
     */
    @NameInMap("LocalVpc")
    public DescribeVpcFirewallDetailResponseBodyLocalVpc localVpc;

    /**
     * <p>The UID of the Cloud Firewall member account.</p>
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
    public DescribeVpcFirewallDetailResponseBodyPeerVpc peerVpc;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>850A84D6-0DE4-4797-A1E8-00090125g4d2</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
     * <p>vpc-firewall-test</p>
     */
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
        /**
         * <p>The destination CIDR block of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The ID of the next hop instance in the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
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
        /**
         * <p>A list of routes for the local VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The ID of the route table for the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1234</p>
         */
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
        /**
         * <p>The instance ID of the ENI in the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-8vbhfosfqv2rff42****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The private IP address of the elastic network interface (ENI) in the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        /**
         * <p>The region ID of the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The ID of the router interface in the local VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        /**
         * <p>A list of CIDR blocks for the local VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList;

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
         * <p>vpc-test-instancel</p>
         */
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
        /**
         * <p>The destination CIDR block of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The ID of the next hop instance in the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
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
        /**
         * <p>A list of routes for the peer VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The ID of the route table for the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1256</p>
         */
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
        /**
         * <p>The instance ID of the ENI in the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-8vbhfosfqv2rff42****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The private IP address of the ENI in the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        /**
         * <p>The region ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The ID of the router interface in the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
        @NameInMap("RouterInterfaceId")
        public String routerInterfaceId;

        /**
         * <p>A list of CIDR blocks for the peer VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallDetailResponseBodyPeerVpcVpcCidrTableList> vpcCidrTableList;

        /**
         * <p>The instance ID of the peer VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-90rq0anm6t8vbwbo****</p>
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
