// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The instance ID of the CEN.</p>
     * <blockquote>
     * <p>Prerequisite: The CEN instance must be created by invoking the CreateCen operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The settings for the switch status of the virtual private cloud (VPC) firewalls at the border. Valid values:</p>
     * <ul>
     * <li><strong>open</strong> (default): Automatically enables protection after you create a VPC and the virtual private cloud (VPC) firewalls at the border are created.</li>
     * <li><strong>close</strong>: Does not automatically enable protection after the virtual private cloud (VPC) firewalls at the border are created. You can invoke the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to enable protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The vSwitch CIDR block used by the firewall. You must configure a CIDR block with a subnet mask of no more than 29 bits that does not conflict with your network planning to allocate to the vSwitch CIDR block required for the procedure of creating the firewall, in order to perform automatic creation of the vSwitch (Cloud_Firewall_VSWITCH) in the firewall secure VPC for traffic diversion and processing. The vSwitch CIDR block must be a subnet of the firewall VPC CIDR block.</p>
     * <p>If you do not specify this parameter, the default is to automatically allocate the 10.219.219.216/29 CIDR block.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.219.219.216/29</p>
     */
    @NameInMap("FirewallVSwitchCidrBlock")
    public String firewallVSwitchCidrBlock;

    /**
     * <p>The ID of the zone to which the firewall vSwitch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-i</p>
     */
    @NameInMap("FirewallVSwitchZoneId")
    public String firewallVSwitchZoneId;

    /**
     * <p>The VPC CIDR block used by the firewall. You must configure a CIDR block with a subnet mask of no more than 28 bits to allocate to the VPC CIDR block required for the procedure of creating the firewall, in order to perform automatic creation of the firewall secure VPC (Cloud_Firewall_VPC) for traffic diversion and processing.</p>
     * <p>If you do not specify this parameter, the default is to automatically allocate the 10.0.0.0/8 CIDR block.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("FirewallVpcCidrBlock")
    public String firewallVpcCidrBlock;

    /**
     * <p>The ID of the secondary zone to which the firewall belongs. Only when the primary zone service is not active, the firewall will perform automatic switchover to the secondary zone to continue running.</p>
     * <p>If you do not specify this parameter, the default is to automatically allocate the secondary zone for the firewall.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.219.219.216/29</p>
     */
    @NameInMap("FirewallVpcStandbyZoneId")
    public String firewallVpcStandbyZoneId;

    /**
     * <p>The ID of the primary zone to which the firewall belongs.
     * If your business is sensitive to latency, you can set the zone of the firewall to be the same as the zone of the vSwitch in your business VPC to reduce latency.</p>
     * <p>If you do not specify this parameter, the system automatically assigns a zone for the firewall.</p>
     * <blockquote>
     * <p>This parameter takes effect only when you create a VPC firewall in the local region of the CEN for the first time.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("FirewallVpcZoneId")
    public String firewallVpcZoneId;

    /**
     * <p>The language of the request and response. Valid values:</p>
     * <ul>
     * <li><p><strong>zh</strong> (default): Chinese.</p>
     * </li>
     * <li><p><strong>en</strong>: English.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member accounts of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The instance ID of the VPC-connected instance for which you want to create virtual private cloud (VPC) firewalls at the border.</p>
     * <blockquote>
     * <p>Prerequisite: The VPC must be added to the CEN specified by the CenId parameter by invoking the AttachCenChildInstance operation.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10zlifxh6j0232w****</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The ID of the vSwitch to which the Cloud Firewall interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-qzeaol304m***</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The instance name of the virtual private cloud (VPC) firewalls at the border.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The region ID of the VPC for which you want to create virtual private cloud (VPC) firewalls at the border.</p>
     * <blockquote>
     * <p>For more information about the regions supported by Cloud Firewall, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("VpcRegion")
    public String vpcRegion;

    public static CreateVpcFirewallCenConfigureRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcFirewallCenConfigureRequest self = new CreateVpcFirewallCenConfigureRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpcFirewallCenConfigureRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallSwitch(String firewallSwitch) {
        this.firewallSwitch = firewallSwitch;
        return this;
    }
    public String getFirewallSwitch() {
        return this.firewallSwitch;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallVSwitchCidrBlock(String firewallVSwitchCidrBlock) {
        this.firewallVSwitchCidrBlock = firewallVSwitchCidrBlock;
        return this;
    }
    public String getFirewallVSwitchCidrBlock() {
        return this.firewallVSwitchCidrBlock;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallVSwitchZoneId(String firewallVSwitchZoneId) {
        this.firewallVSwitchZoneId = firewallVSwitchZoneId;
        return this;
    }
    public String getFirewallVSwitchZoneId() {
        return this.firewallVSwitchZoneId;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallVpcCidrBlock(String firewallVpcCidrBlock) {
        this.firewallVpcCidrBlock = firewallVpcCidrBlock;
        return this;
    }
    public String getFirewallVpcCidrBlock() {
        return this.firewallVpcCidrBlock;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallVpcStandbyZoneId(String firewallVpcStandbyZoneId) {
        this.firewallVpcStandbyZoneId = firewallVpcStandbyZoneId;
        return this;
    }
    public String getFirewallVpcStandbyZoneId() {
        return this.firewallVpcStandbyZoneId;
    }

    public CreateVpcFirewallCenConfigureRequest setFirewallVpcZoneId(String firewallVpcZoneId) {
        this.firewallVpcZoneId = firewallVpcZoneId;
        return this;
    }
    public String getFirewallVpcZoneId() {
        return this.firewallVpcZoneId;
    }

    public CreateVpcFirewallCenConfigureRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateVpcFirewallCenConfigureRequest setMemberUid(String memberUid) {
        this.memberUid = memberUid;
        return this;
    }
    public String getMemberUid() {
        return this.memberUid;
    }

    public CreateVpcFirewallCenConfigureRequest setNetworkInstanceId(String networkInstanceId) {
        this.networkInstanceId = networkInstanceId;
        return this;
    }
    public String getNetworkInstanceId() {
        return this.networkInstanceId;
    }

    public CreateVpcFirewallCenConfigureRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVpcFirewallCenConfigureRequest setVpcFirewallName(String vpcFirewallName) {
        this.vpcFirewallName = vpcFirewallName;
        return this;
    }
    public String getVpcFirewallName() {
        return this.vpcFirewallName;
    }

    public CreateVpcFirewallCenConfigureRequest setVpcRegion(String vpcRegion) {
        this.vpcRegion = vpcRegion;
        return this;
    }
    public String getVpcRegion() {
        return this.vpcRegion;
    }

}
