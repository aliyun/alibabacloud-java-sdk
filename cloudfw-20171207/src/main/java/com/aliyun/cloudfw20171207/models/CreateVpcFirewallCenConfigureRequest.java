// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cen-x5jayxou71ad73****</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>Specifies whether to enable the VPC firewall. Valid values:</p>
     * <ul>
     * <li><strong>open</strong>: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.</li>
     * <li><strong>close</strong>: After you create the VPC firewall, the VPC firewall is disabled. You can call the <a href="https://help.aliyun.com/document_detail/345780.html">ModifyVpcFirewallCenSwitchStatus</a> operation to manually enable the VPC firewall.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>open</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The CIDR block of the vSwitch that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VSWITCH VPC that is automatically created for the VPC firewall for traffic redirection. The CIDR block does not conflict with your network plan. The subnet mask of the CIDR block must be less than or equal to 29 bits in length. The CIDR block of the vSwitch must be within the network segment of the VPC.</p>
     * <p>If you do not specify a value, the CIDR block 10.219.219.216/29 is automatically allocated.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
     * </blockquote>
     */
    @NameInMap("FirewallVSwitchCidrBlock")
    public String firewallVSwitchCidrBlock;

    /**
     * <p>The CIDR block of the VPC that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VPC VPC that is automatically created for the VPC firewall for traffic redirection. The subnet mask of the CIDR block must be less than or equal to 28 bits in length.</p>
     * <p>If you do not specify a value, the CIDR block 10.0.0.0/8 is automatically allocated.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>10.0.0.0/8</p>
     */
    @NameInMap("FirewallVpcCidrBlock")
    public String firewallVpcCidrBlock;

    /**
     * <p>The ID of the backup availability zone to which the firewall belongs. The firewall will automatically switch to the backup availability zone to continue running only if the primary availability zone service is unavailable.
     * If this parameter is not filled, the backup availability zone for the firewall will be automatically assigned.</p>
     * <blockquote>
     * <p>This parameter is only effective when creating a VPC firewall for the first time in this CEN region.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-b</p>
     */
    @NameInMap("FirewallVpcStandbyZoneId")
    public String firewallVpcStandbyZoneId;

    /**
     * <p>The ID of the zone to which the vSwitch belongs. If your service is latency-sensitive, you can specify the same zone for the vSwitch of the firewall and the vSwitch of your business VPC to minimize latency.</p>
     * <p>If you do not specify a value, a zone is automatically assigned for the vSwitch.</p>
     * <blockquote>
     * <p> This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region. For more information about zones that are supported by each region, see <a href="https://help.aliyun.com/document_detail/36064.html">Query zones</a>.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-a</p>
     */
    @NameInMap("FirewallVpcZoneId")
    public String firewallVpcZoneId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese (default)</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>258039427902****</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The ID of the VPC for which you want to create the VPC firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp10zlifxh6j0232w****</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The ID of the vSwitch that is used to associate with the elastic network interface (ENI) required by the VPC firewall.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-qzeaol304m***</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Test instance</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The ID of the region to which the VPC belongs.</p>
     * <blockquote>
     * <p>For more information about the regions, see <a href="https://help.aliyun.com/document_detail/195657.html">Supported regions</a>.</p>
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
