// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallCenDetailResponseBody extends TeaModel {
    @NameInMap("ConnectType")
    public String connectType;

    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    @NameInMap("LocalVpc")
    public DescribeVpcFirewallCenDetailResponseBodyLocalVpc localVpc;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VpcFirewallId")
    public String vpcFirewallId;

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
        @NameInMap("EniId")
        public String eniId;

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
        @NameInMap("DestinationCidr")
        public String destinationCidr;

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
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

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
        @NameInMap("AttachmentId")
        public String attachmentId;

        @NameInMap("AttachmentName")
        public String attachmentName;

        @NameInMap("DefendCidrList")
        public java.util.List<String> defendCidrList;

        @NameInMap("EniList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcEniList> eniList;

        @NameInMap("ManualVSwitchId")
        public String manualVSwitchId;

        @NameInMap("NetworkInstanceId")
        public String networkInstanceId;

        @NameInMap("NetworkInstanceName")
        public String networkInstanceName;

        @NameInMap("NetworkInstanceType")
        public String networkInstanceType;

        @NameInMap("OwnerId")
        public String ownerId;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("RouteMode")
        public String routeMode;

        @NameInMap("SupportManualMode")
        public String supportManualMode;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("TransitRouterType")
        public String transitRouterType;

        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallCenDetailResponseBodyLocalVpcVpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        public String vpcId;

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
