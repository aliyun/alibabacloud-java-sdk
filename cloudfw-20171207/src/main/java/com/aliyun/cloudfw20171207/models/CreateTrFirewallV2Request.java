// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2Request extends TeaModel {
    /**
     * <p>The ID of the CEN instance. This parameter is required. Create a CEN instance in the CEN console before calling this operation, and ensure that an Enterprise Edition transit router has been created.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-4xbjup276au29r****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The zone ID used by the firewall connection.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-h</p>
     */
    @NameInMap("FirewallAttachmentZone")
    public String firewallAttachmentZone;

    /**
     * <p>The description of the firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-description</p>
     */
    @NameInMap("FirewallDescription")
    public String firewallDescription;

    /**
     * <p>The name of the Cloud Firewall instance.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The deployment mode of the firewall service. Valid values:</p>
     * <ul>
     * <li><strong>PrimaryStandby</strong>: Primary/standby mode.</li>
     * <li><strong>MultiPrimary</strong>: Active-active mode.</li>
     * </ul>
     * <blockquote>
     * <p>If this parameter is not specified, the system automatically selects a deployment mode based on the capabilities of the transit router. If an invalid value is specified, the error ErrorFwServiceMode (-360437) is returned. MultiPrimary mode does not support specifying zones.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>PrimaryStandby</p>
     */
    @NameInMap("FirewallServiceMode")
    public String firewallServiceMode;

    /**
     * <p>The list of zone IDs used by the firewall service.</p>
     */
    @NameInMap("FirewallServiceZones")
    public java.util.List<String> firewallServiceZones;

    /**
     * <p>The subnet CIDR block used to store the firewall ENI in the firewall VPC in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.0/24</p>
     */
    @NameInMap("FirewallSubnetCidr")
    @Deprecated
    public String firewallSubnetCidr;

    /**
     * <p>The CIDR block of the firewall VPC in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/16</p>
     */
    @NameInMap("FirewallVpcCidr")
    public String firewallVpcCidr;

    /**
     * <p>The ID of the VPC in which the firewall ENI is created in manual mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9r5qvryn0lg3atb****</p>
     */
    @NameInMap("FirewallVpcId")
    public String firewallVpcId;

    /**
     * <p>The ID of the vSwitch in which the firewall ENI is created in manual mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6ydz3vqj77mr5l6****</p>
     */
    @NameInMap("FirewallVswitchId")
    public String firewallVswitchId;

    /**
     * <p>The language of the response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong> (default): Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the Enterprise Edition transit router. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The routing mode. This parameter is required. Valid values: managed (automatic mode) and manual (manual mode). In managed mode, you must specify FirewallVpcCidr, FirewallSubnetCidr, TrAttachmentSlaveCidr, and TrAttachmentMasterCidr. In manual mode, you must specify FirewallVpcId, FirewallVswitchId, TrAttachmentSlaveZone, and TrAttachmentMasterZone.</p>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    /**
     * <p>The primary subnet CIDR block used to connect to the TR in the firewall VPC in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.3.0/24</p>
     */
    @NameInMap("TrAttachmentMasterCidr")
    @Deprecated
    public String trAttachmentMasterCidr;

    /**
     * <p>The primary zone of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-a</p>
     */
    @NameInMap("TrAttachmentMasterZone")
    public String trAttachmentMasterZone;

    /**
     * <p>The secondary subnet CIDR block used to connect to the TR in the firewall VPC in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.16/28</p>
     */
    @NameInMap("TrAttachmentSlaveCidr")
    @Deprecated
    public String trAttachmentSlaveCidr;

    /**
     * <p>The secondary zone of the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-b</p>
     */
    @NameInMap("TrAttachmentSlaveZone")
    public String trAttachmentSlaveZone;

    /**
     * <p>The list of zone IDs used by the TR connection.</p>
     */
    @NameInMap("TrAttachmentZones")
    public java.util.List<String> trAttachmentZones;

    /**
     * <p>The ID of the Enterprise Edition transit router instance. This parameter is required. The transit router must belong to the CEN instance specified by CenId.</p>
     * 
     * <strong>example:</strong>
     * <p>tr-m5etmb2q7e0mxcur****</p>
     */
    @NameInMap("TransitRouterId")
    public String transitRouterId;

    public static CreateTrFirewallV2Request build(java.util.Map<String, ?> map) throws Exception {
        CreateTrFirewallV2Request self = new CreateTrFirewallV2Request();
        return TeaModel.build(map, self);
    }

    public CreateTrFirewallV2Request setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateTrFirewallV2Request setFirewallAttachmentZone(String firewallAttachmentZone) {
        this.firewallAttachmentZone = firewallAttachmentZone;
        return this;
    }
    public String getFirewallAttachmentZone() {
        return this.firewallAttachmentZone;
    }

    public CreateTrFirewallV2Request setFirewallDescription(String firewallDescription) {
        this.firewallDescription = firewallDescription;
        return this;
    }
    public String getFirewallDescription() {
        return this.firewallDescription;
    }

    public CreateTrFirewallV2Request setFirewallName(String firewallName) {
        this.firewallName = firewallName;
        return this;
    }
    public String getFirewallName() {
        return this.firewallName;
    }

    public CreateTrFirewallV2Request setFirewallServiceMode(String firewallServiceMode) {
        this.firewallServiceMode = firewallServiceMode;
        return this;
    }
    public String getFirewallServiceMode() {
        return this.firewallServiceMode;
    }

    public CreateTrFirewallV2Request setFirewallServiceZones(java.util.List<String> firewallServiceZones) {
        this.firewallServiceZones = firewallServiceZones;
        return this;
    }
    public java.util.List<String> getFirewallServiceZones() {
        return this.firewallServiceZones;
    }

    @Deprecated
    public CreateTrFirewallV2Request setFirewallSubnetCidr(String firewallSubnetCidr) {
        this.firewallSubnetCidr = firewallSubnetCidr;
        return this;
    }
    public String getFirewallSubnetCidr() {
        return this.firewallSubnetCidr;
    }

    public CreateTrFirewallV2Request setFirewallVpcCidr(String firewallVpcCidr) {
        this.firewallVpcCidr = firewallVpcCidr;
        return this;
    }
    public String getFirewallVpcCidr() {
        return this.firewallVpcCidr;
    }

    public CreateTrFirewallV2Request setFirewallVpcId(String firewallVpcId) {
        this.firewallVpcId = firewallVpcId;
        return this;
    }
    public String getFirewallVpcId() {
        return this.firewallVpcId;
    }

    public CreateTrFirewallV2Request setFirewallVswitchId(String firewallVswitchId) {
        this.firewallVswitchId = firewallVswitchId;
        return this;
    }
    public String getFirewallVswitchId() {
        return this.firewallVswitchId;
    }

    public CreateTrFirewallV2Request setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateTrFirewallV2Request setRegionNo(String regionNo) {
        this.regionNo = regionNo;
        return this;
    }
    public String getRegionNo() {
        return this.regionNo;
    }

    public CreateTrFirewallV2Request setRouteMode(String routeMode) {
        this.routeMode = routeMode;
        return this;
    }
    public String getRouteMode() {
        return this.routeMode;
    }

    @Deprecated
    public CreateTrFirewallV2Request setTrAttachmentMasterCidr(String trAttachmentMasterCidr) {
        this.trAttachmentMasterCidr = trAttachmentMasterCidr;
        return this;
    }
    public String getTrAttachmentMasterCidr() {
        return this.trAttachmentMasterCidr;
    }

    public CreateTrFirewallV2Request setTrAttachmentMasterZone(String trAttachmentMasterZone) {
        this.trAttachmentMasterZone = trAttachmentMasterZone;
        return this;
    }
    public String getTrAttachmentMasterZone() {
        return this.trAttachmentMasterZone;
    }

    @Deprecated
    public CreateTrFirewallV2Request setTrAttachmentSlaveCidr(String trAttachmentSlaveCidr) {
        this.trAttachmentSlaveCidr = trAttachmentSlaveCidr;
        return this;
    }
    public String getTrAttachmentSlaveCidr() {
        return this.trAttachmentSlaveCidr;
    }

    public CreateTrFirewallV2Request setTrAttachmentSlaveZone(String trAttachmentSlaveZone) {
        this.trAttachmentSlaveZone = trAttachmentSlaveZone;
        return this;
    }
    public String getTrAttachmentSlaveZone() {
        return this.trAttachmentSlaveZone;
    }

    public CreateTrFirewallV2Request setTrAttachmentZones(java.util.List<String> trAttachmentZones) {
        this.trAttachmentZones = trAttachmentZones;
        return this;
    }
    public java.util.List<String> getTrAttachmentZones() {
        return this.trAttachmentZones;
    }

    public CreateTrFirewallV2Request setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
