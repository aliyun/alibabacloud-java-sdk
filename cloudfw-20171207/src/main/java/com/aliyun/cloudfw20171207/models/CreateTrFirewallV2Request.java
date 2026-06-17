// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateTrFirewallV2Request extends TeaModel {
    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-4xbjup276au29r****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The description of the firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-description</p>
     */
    @NameInMap("FirewallDescription")
    public String firewallDescription;

    /**
     * <p>The name of the firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
    @NameInMap("FirewallName")
    public String firewallName;

    /**
     * <p>The CIDR block of the vSwitch in the firewall VPC that hosts the firewall\&quot;s elastic network interface (ENI). This parameter applies only in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.1.0/24</p>
     */
    @NameInMap("FirewallSubnetCidr")
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
     * <p>The ID of the VPC where the firewall ENI is created. This parameter applies only in manual mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-wz9r5qvryn0lg3atb****</p>
     */
    @NameInMap("FirewallVpcId")
    public String firewallVpcId;

    /**
     * <p>The ID of the vSwitch where the firewall ENI is created. This parameter applies only in manual mode.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-uf6ydz3vqj77mr5l6****</p>
     */
    @NameInMap("FirewallVswitchId")
    public String firewallVswitchId;

    /**
     * <p>The language of the response message. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese</p>
     * </li>
     * <li><p><strong>en</strong>: English</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The region ID of the transit router instance.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionNo")
    public String regionNo;

    /**
     * <p>The routing mode. Valid values:</p>
     * <ul>
     * <li><p><strong>managed</strong>: automatic mode</p>
     * </li>
     * <li><p><strong>manual</strong>: manual mode</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>managed</p>
     */
    @NameInMap("RouteMode")
    public String routeMode;

    /**
     * <p>The CIDR block of the primary vSwitch used to connect to the transit router. This parameter applies only in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.3.0/24</p>
     */
    @NameInMap("TrAttachmentMasterCidr")
    public String trAttachmentMasterCidr;

    /**
     * <p>The primary zone for the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-a</p>
     */
    @NameInMap("TrAttachmentMasterZone")
    public String trAttachmentMasterZone;

    /**
     * <p>The CIDR block of the secondary vSwitch used to connect to the transit router. This parameter applies only in automatic mode.</p>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.16/28</p>
     */
    @NameInMap("TrAttachmentSlaveCidr")
    public String trAttachmentSlaveCidr;

    /**
     * <p>The secondary zone for the vSwitch.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-chengdu-b</p>
     */
    @NameInMap("TrAttachmentSlaveZone")
    public String trAttachmentSlaveZone;

    /**
     * <p>The ID of the transit router instance.</p>
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

    public CreateTrFirewallV2Request setTransitRouterId(String transitRouterId) {
        this.transitRouterId = transitRouterId;
        return this;
    }
    public String getTransitRouterId() {
        return this.transitRouterId;
    }

}
