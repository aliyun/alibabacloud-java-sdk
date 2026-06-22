// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The switch status of the VPC border firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong> (default): Protection is automatically enabled after the VPC border firewall is created.</li>
     * <li><strong>close</strong>: Protection is not automatically enabled after the VPC border firewall is created. You can call the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to enable protection.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The vSwitch CIDR block used by the firewall. You must configure a CIDR block with a subnet mask no larger than 29 bits that does not conflict with the network plan to allocate a vSwitch CIDR block for the firewall creation process. This is used to automatically create a vSwitch (Cloud_Firewall_VSWITCH) within the firewall security VPC for traffic redirection. The vSwitch CIDR block must be a subnet of the firewall VPC CIDR block.</p>
     * <p>If this parameter is not specified, the CIDR block 10.219.219.216/29 is automatically allocated by default.</p>
     * <blockquote>
     * <p>This parameter is only valid when a VPC firewall is created for the first time in this CEN region.</p>
     * </blockquote>
     */
    @NameInMap("FirewallVSwitchCidrBlock")
    public String firewallVSwitchCidrBlock;

    /**
     * <p>The VPC CIDR block used by the firewall. You must configure a CIDR block with a subnet mask no larger than 28 bits to allocate a VPC CIDR block for the firewall creation process. This is used to automatically create a firewall security VPC (Cloud_Firewall_VPC) for traffic redirection.</p>
     * <p>If this parameter is not specified, the CIDR block 10.0.0.0/8 is automatically allocated by default.</p>
     * <blockquote>
     * <p>This parameter is only valid when a VPC firewall is created for the first time in this CEN region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("FirewallVpcCidrBlock")
    public String firewallVpcCidrBlock;

    /**
     * <p>The standby availability zone ID of the firewall. The firewall automatically switches to the standby availability zone and continues to run only when the primary availability zone service is unavailable.</p>
     * <p>If this parameter is not specified, the firewall standby availability zone is automatically allocated by default.</p>
     * <blockquote>
     * <p>This parameter is only valid when a VPC firewall is created for the first time in this CEN region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("FirewallVpcStandbyZoneId")
    public String firewallVpcStandbyZoneId;

    /**
     * <p>The primary availability zone ID of the firewall.
     * If your business is latency-sensitive, you can customize the firewall availability zone to be the same as your business VPC vSwitch availability zone to reduce latency.</p>
     * <p>If this parameter is not specified, the firewall availability zone is automatically allocated by default.</p>
     * <blockquote>
     * <p>This parameter is only valid when a VPC firewall is created for the first time in this CEN region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("FirewallVpcZoneId")
    public String firewallVpcZoneId;

    /**
     * <p>The language type for the request and response messages. Valid values:</p>
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
     * <p>The member account UID of the current Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The VPC instance ID for which the VPC border firewall is created.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10zlifxh6j0232w****</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The vSwitch ID to which the Cloud Firewall interface belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-qzeaol304m***</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The instance name of the VPC border firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-firewall-test</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The region ID of the VPC for which the VPC border firewall is created.</p>
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
