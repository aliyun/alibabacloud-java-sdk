// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The instance ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The status of the virtual private cloud (VPC) firewall after you create a VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong> (default): The VPC firewall is automatically enabled after it is created.</li>
     * <li><strong>close</strong>: The VPC firewall is not automatically enabled after it is created. You can invoke the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to enable the VPC firewall.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The CIDR block of the vSwitch used by the firewall. Specify a CIDR block with a subnet mask of no more than 29 bits that does not conflict with your network planning. This CIDR block is allocated to the vSwitch that is created during the process to create a VPC firewall within the firewall security VPC (Cloud_Firewall_VSWITCH) for traffic redirection. The vSwitch CIDR block must be a subnet of the firewall VPC CIDR block.</p>
     * <p>If you leave this parameter empty, the default CIDR block 10.219.219.216/29 is automatically allocated.</p>
     * <blockquote>
     * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
     * </blockquote>
     */
    @NameInMap("FirewallVSwitchCidrBlock")
    public String firewallVSwitchCidrBlock;

    /**
     * <p>The CIDR block of the VPC used by the firewall. Specify a CIDR block with a subnet mask of no more than 28 bits. This CIDR block is allocated to the VPC that is created during the process to create a VPC firewall (Cloud_Firewall_VPC) for traffic redirection.</p>
     * <p>If you leave this parameter empty, the default CIDR block 10.0.0.0/8 is automatically allocated.</p>
     * <blockquote>
     * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("FirewallVpcCidrBlock")
    public String firewallVpcCidrBlock;

    /**
     * <p>The ID of the secondary zone to which the firewall belongs. The firewall performs an automatic switchover to the secondary zone to continue running only when the primary zone becomes unavailable.</p>
     * <p>If you leave this parameter empty, a default secondary zone is automatically allocated for the firewall.</p>
     * <blockquote>
     * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("FirewallVpcStandbyZoneId")
    public String firewallVpcStandbyZoneId;

    /**
     * <p>The ID of the primary active zone to which the firewall belongs. If your business is latency-sensitive, you can set the firewall zone to the same zone as the vSwitch of the business VPC to reduce latency.</p>
     * <p>If you leave this parameter empty, a default zone is automatically allocated for the firewall.</p>
     * <blockquote>
     * <p>This parameter takes effect only when a VPC firewall is created for the first time in the local region of the CEN instance.</p>
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
     * <p>The UID of the member account of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The instance ID of the VPC for which you want to create a VPC firewall.</p>
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
     * <p>The instance name of the virtual private cloud (VPC) firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The region ID of the VPC for which you want to create a VPC firewall.</p>
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
