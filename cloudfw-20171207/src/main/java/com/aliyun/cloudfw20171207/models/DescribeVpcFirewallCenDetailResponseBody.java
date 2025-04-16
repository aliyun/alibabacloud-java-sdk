// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailResponseBody extends TeaModel {
    /**
     * <p>The connection type of the VPC firewall. The value is fixed as <strong>cen</strong>, which indicates CEN instances.</p>
     * 
     * <strong>example:</strong>
     * <p>cen</p>
     */
    @NameInMap("ConnectType")
    public String connectType;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>opened</strong>: enabled</li>
     * <li><strong>closed</strong>: disabled</li>
     * <li><strong>notconfigured</strong>: not configured</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The firewall VPC.</p>
     */
    @NameInMap("FirewallVpc")
    public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc firewallVpc;

    /**
     * <p>The details about the VPC.</p>
     */
    @NameInMap("LocalVpc")
    public DescribeVpcFirewallCenDetailResponseBodyLocalVpc localVpc;

    /**
     * <p>The ID of the request.</p>
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
     * <p>Test firewall</p>
     */
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

    public DescribeVpcFirewallCenDetailResponseBody setFirewallVpc(DescribeVpcFirewallCenDetailResponseBodyFirewallVpc firewallVpc) {
        this.firewallVpc = firewallVpc;
        return this;
    }
    public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc getFirewallVpc() {
        return this.firewallVpc;
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

    public static class DescribeVpcFirewallCenDetailResponseBodyFirewallVpc extends TeaModel {
        /**
         * <p>Indicates whether you can specify a CIDR block when you create a VPC firewall for a Basic Edition transit router of a CEN instance. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AllowConfiguration")
        public Integer allowConfiguration;

        /**
         * <p>Firewall backup availability zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-k</p>
         */
        @NameInMap("StandbyZoneId")
        public String standbyZoneId;

        /**
         * <p>The CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("VpcCidr")
        public String vpcCidr;

        /**
         * <p>The VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1245k5oagy2bp74****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The CIDR block of the vSwitch.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.1/24</p>
         */
        @NameInMap("VswitchCidr")
        public String vswitchCidr;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1sqg9wms9wxcs1****</p>
         */
        @NameInMap("VswitchId")
        public String vswitchId;

        /**
         * <p>The availability zone ID of the virtual switch.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("VswitchZoneId")
        public String vswitchZoneId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-i</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static DescribeVpcFirewallCenDetailResponseBodyFirewallVpc build(java.util.Map<String, ?> map) throws Exception {
            DescribeVpcFirewallCenDetailResponseBodyFirewallVpc self = new DescribeVpcFirewallCenDetailResponseBodyFirewallVpc();
            return TeaModel.build(map, self);
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setAllowConfiguration(Integer allowConfiguration) {
            this.allowConfiguration = allowConfiguration;
            return this;
        }
        public Integer getAllowConfiguration() {
            return this.allowConfiguration;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setStandbyZoneId(String standbyZoneId) {
            this.standbyZoneId = standbyZoneId;
            return this;
        }
        public String getStandbyZoneId() {
            return this.standbyZoneId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setVpcCidr(String vpcCidr) {
            this.vpcCidr = vpcCidr;
            return this;
        }
        public String getVpcCidr() {
            return this.vpcCidr;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setVswitchCidr(String vswitchCidr) {
            this.vswitchCidr = vswitchCidr;
            return this;
        }
        public String getVswitchCidr() {
            return this.vswitchCidr;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setVswitchId(String vswitchId) {
            this.vswitchId = vswitchId;
            return this;
        }
        public String getVswitchId() {
            return this.vswitchId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setVswitchZoneId(String vswitchZoneId) {
            this.vswitchZoneId = vswitchZoneId;
            return this;
        }
        public String getVswitchZoneId() {
            return this.vswitchZoneId;
        }

        public DescribeVpcFirewallCenDetailResponseBodyFirewallVpc setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList extends TeaModel {
        /**
         * <p>The ID of the ENI that belongs to the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-8vbhfosfqv2rff42****</p>
         */
        @NameInMap("EniId")
        public String eniId;

        /**
         * <p>The private IP address of the ENI that belongs to the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX</p>
         */
        @NameInMap("EniPrivateIpAddress")
        public String eniPrivateIpAddress;

        /**
         * <p>The ID of the vSwitch to which the ENI is connected.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-wz9viido7j436b0n1****</p>
         */
        @NameInMap("EniVSwitchId")
        public String eniVSwitchId;

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

        public DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList setEniVSwitchId(String eniVSwitchId) {
            this.eniVSwitchId = eniVSwitchId;
            return this;
        }
        public String getEniVSwitchId() {
            return this.eniVSwitchId;
        }

    }

    public static class DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList extends TeaModel {
        /**
         * <p>The destination CIDR block of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.XX.XX/24</p>
         */
        @NameInMap("DestinationCidr")
        public String destinationCidr;

        /**
         * <p>The instance ID of the next hop for the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vrt-m5eb5me6c3l5sezae****</p>
         */
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
        /**
         * <p>The route entries for the VPC.</p>
         */
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

        /**
         * <p>The route table ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vtb-1234</p>
         */
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
        /**
         * <p>The ID of the connection between two network instances.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-attach-sxig7bye51fid5****</p>
         */
        @NameInMap("AttachmentId")
        public String attachmentId;

        /**
         * <p>The name of the connection between two network instances.</p>
         * 
         * <strong>example:</strong>
         * <p>Local test</p>
         */
        @NameInMap("AttachmentName")
        public String attachmentName;

        /**
         * <p>An array consisting of the CIDR blocks that are protected by the VPC firewall.</p>
         */
        @NameInMap("DefendCidrList")
        public java.util.List<String> defendCidrList;

        /**
         * <p>The Elastic Network Interfaces (ENIs).</p>
         */
        @NameInMap("EniList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList> eniList;

        /**
         * <p>The ID of the specified vSwitch when the routing mode is manual.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-zeq4o875u****</p>
         */
        @NameInMap("ManualVSwitchId")
        public String manualVSwitchId;

        /**
         * <p>The ID of the VPC for which the VPC firewall is created.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zefk9fbn8j7v585g****</p>
         */
        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        /**
         * <p>The name of the network instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Test VPC</p>
         */
        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        /**
         * <p>The type of the network instance. The value is fixed as <strong>VPC</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>VPC</p>
         */
        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        /**
         * <p>The UID of the Alibaba Cloud account to which the VPC belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>158039427902****</p>
         */
        @NameInMap("OwnerId")
        public String ownerId;

        /**
         * <p>The ID of the region in which the VPC resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>The routing mode. Valid values:</p>
         * <ul>
         * <li>auto: automatic mode</li>
         * <li>manual: manual mode</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("RouteMode")
        public String routeMode;

        /**
         * <p>Indicates whether the manual routing mode is supported. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SupportManualMode")
        public String supportManualMode;

        /**
         * <p>The instance ID of the CEN transit router.</p>
         * 
         * <strong>example:</strong>
         * <p>tr-2zetwxskej633l3u1****</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The edition of the CEN transit router. Valid values:</p>
         * <ul>
         * <li><strong>Basic</strong>: Basic Edition</li>
         * <li><strong>Enterprise</strong>: Enterprise Edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Basic</p>
         */
        @NameInMap("TransitRouterType")
        public String transitRouterType;

        /**
         * <p>An array that consists of the CIDR blocks of the VPC.</p>
         */
        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList;

        /**
         * <p>The ID of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-8vbwbo90rq0anm6t****</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        /**
         * <p>The name of the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>Test instance</p>
         */
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
