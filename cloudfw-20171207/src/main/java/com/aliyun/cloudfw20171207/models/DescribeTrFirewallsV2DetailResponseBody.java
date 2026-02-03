// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeTrFirewallsV2DetailResponseBody extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-37nddhri7jf0d2****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>VPC Firewall</p>
     */
    @NameInMap("FirewallDescription")
    public String firewallDescription;

    /**
     * <p>The ID of the Elastic Network Interface (ENI) with which the VPC firewall is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>eni-uf621u00nafypeex****</p>
     */
    @NameInMap("FirewallEniId")
    public String firewallEniId;

    /**
     * <p>The ID of the VPC to which the ENI is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-2zeppcci782zeh2bk****</p>
     */
    @NameInMap("FirewallEniVpcId")
    public String firewallEniVpcId;

    /**
     * <p>The ID of the vSwitch with which the ENI is associated.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6ptq1kl1c1d9pw9****</p>
     */
    @NameInMap("FirewallEniVswitchId")
    public String firewallEniVswitchId;

    /**
     * <p>The instance ID of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vfw-tr-9c7c711abdfa4d80****</p>
     */
    @NameInMap("FirewallId")
    public String firewallId;

    /**
     * <p>The name of the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>cloudfirewall-manual</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li>Creating</li>
     * <li>Deleting</li>
     * <li>Ready</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
    @NameInMap("FirewallStatus")
    public String firewallStatus;

    /**
     * <p>The subnet CIDR block of the VPC in which the ENI of the firewall is stored in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.0/24</p>
     */
    @NameInMap("FirewallSubnetCidr")
    public String firewallSubnetCidr;

    /**
     * <p>The status of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>opened</strong>: The VPC firewall is enabled.</li>
     * <li><strong>closed</strong>: The VPC firewall is disabled.</li>
     * <li><strong>notconfigured</strong>: The VPC firewall is not created.</li>
     * <li><strong>configured</strong>: The VPC firewall is created but is not enabled.</li>
     * <li><strong>creating</strong>: The VPC firewall is being created.</li>
     * <li><strong>opening</strong>: The VPC firewall is being enabled.</li>
     * <li><strong>deleting</strong>: The VPC firewall is being deleted.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, VPC firewalls in all states are queried.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>opened</p>
     */
    @NameInMap("FirewallSwitchStatus")
    public String firewallSwitchStatus;

    /**
     * <p>The CIDR block that is allocated to the VPC created for the VPC firewall in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/16</p>
     */
    @NameInMap("FirewallVpcCidr")
    public String firewallVpcCidr;

    /**
     * <p>The region ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>7E53A7FB-3EB9-5E33-8E50-B8F417D1E02B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The routing mode of the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>managed</strong>: automatic mode</li>
     * <li><strong>manual</strong>: manual mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    @NameInMap("TrAttachmentId")
    public String trAttachmentId;

    /**
     * <p>The primary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.2.0/24</p>
     */
    @NameInMap("TrAttachmentMasterCidr")
    public String trAttachmentMasterCidr;

    /**
     * <p>In automatic mode, the primary availability zone of the subnet in the firewall VPC used for connecting to TR.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("TrAttachmentMasterZone")
    public String trAttachmentMasterZone;

    /**
     * <p>The secondary subnet CIDR block that the VPC uses to connect to the transit router in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.3.0/24</p>
     */
    @NameInMap("TrAttachmentSlaveCidr")
    public String trAttachmentSlaveCidr;

    /**
     * <p>In automatic mode, the backup availability zone for the subnet used to connect TR in the firewall VPC.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("TrAttachmentSlaveZone")
    public String trAttachmentSlaveZone;

    /**
     * <p>The ID of the transit router.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-wz9y8sgug8b1xb416****</p>
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

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentId(String trAttachmentId) {
        this.trAttachmentId = trAttachmentId;
        return this;
    }
    public String getTrAttachmentId() {
        return this.trAttachmentId;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentMasterCidr(String trAttachmentMasterCidr) {
        this.trAttachmentMasterCidr = trAttachmentMasterCidr;
        return this;
    }
    public String getTrAttachmentMasterCidr() {
        return this.trAttachmentMasterCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentMasterZone(String trAttachmentMasterZone) {
        this.trAttachmentMasterZone = trAttachmentMasterZone;
        return this;
    }
    public String getTrAttachmentMasterZone() {
        return this.trAttachmentMasterZone;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
        this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
        return this;
    }
    public String getTrAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTrAttachmentSlaveZone(String trAttachmentSlaveZone) {
        this.trAttachmentSlaveZone = trAttachmentSlaveZone;
        return this;
    }
    public String getTrAttachmentSlaveZone() {
        return this.trAttachmentSlaveZone;
    }

    public DescribeTrFirewallsV2DetailResponseBody setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
