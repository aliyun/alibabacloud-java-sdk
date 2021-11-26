// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeVpcFirewallListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

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
        @NameInMap("BasicRules")
        public Integer basicRules;

        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

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
        @NameInMap("DestinationCidr")
        public String destinationCidr;

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
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableListRouteEntryList> routeEntryList;

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
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpcVpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("DestinationCidr")
        public String destinationCidr;

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
        @NameInMap("RouteEntryList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableListRouteEntryList> routeEntryList;

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
        @NameInMap("AuthorizationStatus")
        public String authorizationStatus;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("VpcCidrTableList")
        public java.util.List<DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpcVpcCidrTableList> vpcCidrTableList;

        @NameInMap("VpcId")
        public String vpcId;

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
        @NameInMap("Bandwidth")
        public Integer bandwidth;

        @NameInMap("ConnectType")
        public String connectType;

        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        @NameInMap("IpsConfig")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsIpsConfig ipsConfig;

        @NameInMap("LocalVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsLocalVpc localVpc;

        @NameInMap("MemberUid")
        public String memberUid;

        @NameInMap("PeerVpc")
        public DescribeVpcFirewallListResponseBodyVpcFirewallsPeerVpc peerVpc;

        @NameInMap("RegionStatus")
        public String regionStatus;

        @NameInMap("VpcFirewallId")
        public String vpcFirewallId;

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
