// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2ListResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    /**
     * <p>The VPC firewalls.</p>
     */
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
        /**
         * <p>Indicates whether basic protection is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("BasicRules")
        public Integer basicRules;

        /**
         * <p>Indicates whether virtual patching is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("EnableAllPatch")
        public Integer enableAllPatch;

        /**
         * <p>The mode of the IPS. Valid values:</p>
         * <br>
         * <p>*   **1**: block mode</p>
         * <p>*   **0**: monitor mode</p>
         */
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
        /**
         * <p>The number of protected resources.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The protected peer transit routers.</p>
         */
        @NameInMap("PeerTrList")
        public java.util.List<String> peerTrList;

        /**
         * <p>The protected virtual border routers (VBRs).</p>
         */
        @NameInMap("VbrList")
        public java.util.List<String> vbrList;

        /**
         * <p>The protected VPCs.</p>
         */
        @NameInMap("VpcList")
        public java.util.List<String> vpcList;

        /**
         * <p>The protected VPN gateways.</p>
         */
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
        /**
         * <p>The number of unprotected resources.</p>
         */
        @NameInMap("Count")
        public Integer count;

        /**
         * <p>The unprotected peer transit routers.</p>
         */
        @NameInMap("PeerTrList")
        public java.util.List<String> peerTrList;

        /**
         * <p>The unprotected VBRs.</p>
         */
        @NameInMap("VbrList")
        public java.util.List<String> vbrList;

        /**
         * <p>The unprotected VPCs.</p>
         */
        @NameInMap("VpcList")
        public java.util.List<String> vpcList;

        /**
         * <p>The unprotected VPN gateways.</p>
         */
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
        /**
         * <p>The ID of the CEN instance.</p>
         */
        @NameInMap("CenId")
        public String cenId;

        /**
         * <p>The name of the CEN instance.</p>
         */
        @NameInMap("CenName")
        public String cenName;

        /**
         * <p>The instance ID of the VPC firewall.</p>
         */
        @NameInMap("FirewallId")
        public String firewallId;

        /**
         * <p>The status of the VPC firewall. Valid values:</p>
         * <br>
         * <p>*   **opened**: The VPC firewall is enabled.</p>
         * <p>*   **closed**: The VPC firewall is disabled.</p>
         * <p>*   **notconfigured**: The VPC firewall is not created.</p>
         * <p>*   **configured**: The VPC firewall is created but is not enabled.</p>
         * <p>*   **creating**: The VPC firewall is being created.</p>
         * <p>*   **opening**: The VPC firewall is being enabled.</p>
         * <p>*   **deleting**: The VPC firewall is being deleted.</p>
         * <br>
         * <p>>  If you do not specify this parameter, VPC firewalls in all states are queried.</p>
         */
        @NameInMap("FirewallSwitchStatus")
        public String firewallSwitchStatus;

        /**
         * <p>The information about the intrusion prevention system (IPS) configuration.</p>
         */
        @NameInMap("IpsConfig")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsIpsConfig ipsConfig;

        /**
         * <p>The ID of the Alibaba Cloud account to which the VPC belongs.</p>
         */
        @NameInMap("OwnerId")
        public Long ownerId;

        /**
         * <p>Indicates whether the VPC firewall can be automatically enabled. Valid values:</p>
         * <br>
         * <p>*   **passed**: yes</p>
         * <p>*   **failed**: no</p>
         * <p>*   **unknown**</p>
         */
        @NameInMap("PrecheckStatus")
        public String precheckStatus;

        /**
         * <p>The protected resources.</p>
         */
        @NameInMap("ProtectedResource")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsProtectedResource protectedResource;

        /**
         * <p>The region ID of the transit router.</p>
         */
        @NameInMap("RegionNo")
        public String regionNo;

        /**
         * <p>Indicates whether you can create a VPC firewall in a specified region. Valid values:</p>
         * <br>
         * <p>*   **enable**: yes</p>
         * <p>*   **disable**: no</p>
         */
        @NameInMap("RegionStatus")
        public String regionStatus;

        /**
         * <p>The result code of the operation that creates the VPC firewall. Valid values:</p>
         * <br>
         * <p>*   **RegionDisable**: VPC Firewall is not supported in the region of the network instance. You cannot create a VPC firewall for the network instance.</p>
         * <p>*   **Empty string**: You can create a VPC firewall for the network instance.</p>
         */
        @NameInMap("ResultCode")
        public String resultCode;

        /**
         * <p>The routing mode of the VPC firewall. Valid values:</p>
         * <br>
         * <p>*   **managed**: automatic mode</p>
         * <p>*   **manual**: manual mode</p>
         */
        @NameInMap("RouteMode")
        public String routeMode;

        /**
         * <p>The ID of the transit router.</p>
         */
        @NameInMap("TransitRouterId")
        public String transitRouterId;

        /**
         * <p>The unprotected resources.</p>
         */
        @NameInMap("UnprotectedResource")
        public DescribeTrFirewallsV2ListResponseBodyVpcTrFirewallsUnprotectedResource unprotectedResource;

        /**
         * <p>The instance name of the VPC firewall.</p>
         */
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
