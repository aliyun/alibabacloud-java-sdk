// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2ListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public String totalCount;

    @NameInMap("VpcTrFirewalls")
    public java.util.List<DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls> vpcTrFirewalls;

    public static DescribeTrFirewallsV2ListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2ListResponseBody self = new DescribeTrFirewallsV2ListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2ListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrFirewallsV2ListResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public DescribeTrFirewallsV2ListResponseBody setVpcTrFirewalls(java.util.List<DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls> vpcTrFirewalls) {
        this.vpcTrFirewalls = vpcTrFirewalls;
        return this;
    }
    public java.util.List<DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls> getVpcTrFirewalls() {
        return this.vpcTrFirewalls;
    }

    public static class DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig extends TeaModel {
        @NameInMap("BasicRules")
        public Integer basicRules;

        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        @NameInMap("RunMode")
        public Integer runMode;

        public static DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig self = new DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig setBasicRules(Integer basicRules) {
            this.basicRules = basicRules;
            return this;
        }
        public Integer getBasicRules() {
            return this.basicRules;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig setEnableAllPatch(Integer enableAllPatch) {
            this.enableAllPatch = enableAllPatch;
            return this;
        }
        public Integer getEnableAllPatch() {
            return this.enableAllPatch;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig setRunMode(Integer runMode) {
            this.runMode = runMode;
            return this;
        }
        public Integer getRunMode() {
            return this.runMode;
        }

    }

    public static class DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("PeerTrList")
        public java.util.List<String> peerTrList;

        @NameInMap("VbrList")
        public java.util.List<String> vbrList;

        @NameInMap("VpcList")
        public java.util.List<String> vpcList;

        @NameInMap("VpnList")
        public java.util.List<String> vpnList;

        public static DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource self = new DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource setPeerTrList(java.util.List<String> peerTrList) {
            this.peerTrList = peerTrList;
            return this;
        }
        public java.util.List<String> getPeerTrList() {
            return this.peerTrList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource setVbrList(java.util.List<String> vbrList) {
            this.vbrList = vbrList;
            return this;
        }
        public java.util.List<String> getVbrList() {
            return this.vbrList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource setVpcList(java.util.List<String> vpcList) {
            this.vpcList = vpcList;
            return this;
        }
        public java.util.List<String> getVpcList() {
            return this.vpcList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource setVpnList(java.util.List<String> vpnList) {
            this.vpnList = vpnList;
            return this;
        }
        public java.util.List<String> getVpnList() {
            return this.vpnList;
        }

    }

    public static class DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("PeerTrList")
        public java.util.List<String> peerTrList;

        @NameInMap("VbrList")
        public java.util.List<String> vbrList;

        @NameInMap("VpcList")
        public java.util.List<String> vpcList;

        @NameInMap("VpnList")
        public java.util.List<String> vpnList;

        public static DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource self = new DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource setPeerTrList(java.util.List<String> peerTrList) {
            this.peerTrList = peerTrList;
            return this;
        }
        public java.util.List<String> getPeerTrList() {
            return this.peerTrList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource setVbrList(java.util.List<String> vbrList) {
            this.vbrList = vbrList;
            return this;
        }
        public java.util.List<String> getVbrList() {
            return this.vbrList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource setVpcList(java.util.List<String> vpcList) {
            this.vpcList = vpcList;
            return this;
        }
        public java.util.List<String> getVpcList() {
            return this.vpcList;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource setVpnList(java.util.List<String> vpnList) {
            this.vpnList = vpnList;
            return this;
        }
        public java.util.List<String> getVpnList() {
            return this.vpnList;
        }

    }

    public static class DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls extends TeaModel {
        @NameInMap("CenId")
        public String cenId;

        @NameInMap("CenName")
        public String cenName;

        @NameInMap("FirewallId")
        public String firewallId;

        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        @NameInMap("IpsConfig")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig ipsConfig;

        @NameInMap("OwnerId")
        public Long ownerId;

        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        @NameInMap("ProtectedResource")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource protectedResource;

        @NameInMap("RegionNo")
        public String regionNo;

        @NameInMap("RegionStatus")
        public String regionStatus;

        @NameInMap("ResultCode")
        public String resultCode;

        @NameInMap("RouteMode")
        public String routeMode;

        @NameInMap("TransitRouterId")
        public String transitRouterId;

        @NameInMap("UnprotectedResource")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource unprotectedResource;

        @NameInMap("VpcFirewallName")
        public String vpcFirewallName;

        public static DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls build(java.util.Map<String, ?> map) throws Exception {
            DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls self = new DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls();
            return TeaModel.build(map, self);
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setCenId(String cenId) {
            this.cenId = cenId;
            return this;
        }
        public String getCenId() {
            return this.cenId;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setCenName(String cenName) {
            this.cenName = cenName;
            return this;
        }
        public String getCenName() {
            return this.cenName;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setFirewallId(String firewallId) {
            this.firewallId = firewallId;
            return this;
        }
        public String getFirewallId() {
            return this.firewallId;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setFirewallSwitchStatus(String firewallSwitchStatus) {
            this.firewallSwitchStatus = firewallSwitchStatus;
            return this;
        }
        public String getFirewallSwitchStatus() {
            return this.firewallSwitchStatus;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setIpsConfig(DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig ipsConfig) {
            this.ipsConfig = ipsConfig;
            return this;
        }
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig getIpsConfig() {
            return this.ipsConfig;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setOwnerId(Long ownerId) {
            this.ownerId = ownerId;
            return this;
        }
        public Long getOwnerId() {
            return this.ownerId;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setPrecheckStatus(String precheckStatus) {
            this.precheckStatus = precheckStatus;
            return this;
        }
        public String getPrecheckStatus() {
            return this.precheckStatus;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setProtectedResource(DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource protectedResource) {
            this.protectedResource = protectedResource;
            return this;
        }
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource getProtectedResource() {
            return this.protectedResource;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setRegionNo(String regionNo) {
            this.regionNo = regionNo;
            return this;
        }
        public String getRegionNo() {
            return this.regionNo;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setRegionStatus(String regionStatus) {
            this.regionStatus = regionStatus;
            return this;
        }
        public String getRegionStatus() {
            return this.regionStatus;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setResultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }
        public String getResultCode() {
            return this.resultCode;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setRouteMode(String routeMode) {
            this.routeMode = routeMode;
            return this;
        }
        public String getRouteMode() {
            return this.routeMode;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setTransitRouterId(String transitRouterId) {
            this.transitRouterId = transitRouterId;
            return this;
        }
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setUnprotectedResource(DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource unprotectedResource) {
            this.unprotectedResource = unprotectedResource;
            return this;
        }
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource getUnprotectedResource() {
            return this.unprotectedResource;
        }

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
