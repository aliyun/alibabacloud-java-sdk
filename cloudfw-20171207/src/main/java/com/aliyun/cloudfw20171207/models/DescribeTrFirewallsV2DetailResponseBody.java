// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the VPC firewall.</p>
     */
    @NameInMap("FirewallDescription")
    public String firewallDescription;

    /**
     * <p>The ID of the Elastic Network Interface (ENI) with which the VPC firewall is associated.</p>
     */
    @NameInMap("FirewallEniId")
    public String firewallEniId;

    /**
     * <p>The ID of the VPC to which the ENI is attached.</p>
     */
    @NameInMap("FirewallEniVpcId")
    public String firewallEniVpcId;

    /**
     * <p>The ID of the vSwitch with which the ENI is associated.</p>
     */
    @NameInMap("FirewallEniVswitchId")
    public String firewallEniVswitchId;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall.</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   Creating</p>
     * <p>*   Deleting</p>
     * <p>*   Ready</p>
     */
    @NameInMap("FirewallStatus")
    public String firewallStatus;

    @NameInMap("FirewallSubnetCidr")
    public String firewallSubnetCidr;

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
     * <p>> If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    @NameInMap("FirewallVpcCidr")
    public String firewallVpcCidr;

    /**
     * <p>The region ID of the transit router.</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing mode of the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   **managed**: automatic mode</p>
     * <p>*   **manual**: manual mode</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    @NameInMap("TrAttachmentMasterCidr")
    public String trAttachmentMasterCidr;

    @NameInMap("TrAttachmentSlaveCidr")
    public String trAttachmentSlaveCidr;

    /**
     * <p>The ID of the transit router.</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static DescribeTrFirewallsV2DetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTrFirewallsV2DetailResponseBody self = new DescribeTrFirewallsV2DetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTrFirewallsV2DetailResponseBody setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallDescription(String firewallDescription) {
        this.firewallDescription = firewallDescription;
        return this;
    }
    public String getFirewallDescription() {
        return this.firewallDescription;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniId(String firewallEniId) {
        this.firewallEniId = firewallEniId;
        return this;
    }
    public String getFirewallEniId() {
        return this.firewallEniId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniVpcId(String firewallEniVpcId) {
        this.firewallEniVpcId = firewallEniVpcId;
        return this;
    }
    public String getFirewallEniVpcId() {
        return this.firewallEniVpcId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallEniVswitchId(String firewallEniVswitchId) {
        this.firewallEniVswitchId = firewallEniVswitchId;
        return this;
    }
    public String getFirewallEniVswitchId() {
        return this.firewallEniVswitchId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallId(String firewallId) {
        this.firewallId = firewallId;
        return this;
    }
    public String getFirewallId() {
        return this.firewallId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }
    public String getFirewallName() {
        return this.firewallName;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallStatus(String firewallStatus) {
        this.firewallStatus = firewallStatus;
        return this;
    }
    public String getFirewallStatus() {
        return this.firewallStatus;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallSubnetCidr(String firewallSubnetCidr) {
        this.firewallSubnetCidr = firewallSubnetCidr;
        return this;
    }
    public String getFirewallSubnetCidr() {
        return this.firewallSubnetCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallSwitchStatus(String firewallSwitchStatus) {
        this.firewallSwitchStatus = firewallSwitchStatus;
        return this;
    }
    public String getFirewallSwitchStatus() {
        return this.firewallSwitchStatus;
    }

    public DescribeTrFirewallsV2DetailResponseBody setFirewallVpcCidr(String firewallVpcCidr) {
        this.firewallVpcCidr = firewallVpcCidr;
        return this;
    }
    public String getFirewallVpcCidr() {
        return this.firewallVpcCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }
    public String getRouteMode() {
        return this.routeMode;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentMasterCidr(String trAttachmentMasterCidr) {
        this.trAttachmentMasterCidr = trAttachmentMasterCidr;
        return this;
    }
    public String getTrAttachmentMasterCidr() {
        return this.trAttachmentMasterCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
        this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
        return this;
    }
    public String getTrAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
