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

        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewalls setVpcFirewallName(String vpcFirewallName) {
            this.vpcFirewallName = vpcFirewallName;
            return this;
        }
        public String getVpcFirewallName() {
            return this.vpcFirewallName;
        }

    }

}
