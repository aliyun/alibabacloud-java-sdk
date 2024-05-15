// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class CreateVpcFirewallCenConfigureRequest extends TeaModel {
    /**
     * <p>The ID of the CEN instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>Specifies whether to enable the VPC firewall. Valid values:</p>
     * <br>
     * <p>*   **open**: After you create the VPC firewall, the VPC firewall is automatically enabled. This is the default value.</p>
     * <p>*   **close**: After you create the VPC firewall, the VPC firewall is disabled. You can call the [ModifyVpcFirewallCenSwitchStatus](https://help.aliyun.com/document_detail/345780.html) operation to manually enable the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("FirewallSwitch")
    public String firewallSwitch;

    /**
     * <p>The CIDR block of the vSwitch that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VSWITCH VPC that is automatically created for the VPC firewall for traffic redirection. The CIDR block does not conflict with your network plan. The subnet mask of the CIDR block must be less than or equal to 29 bits in length. The CIDR block of the vSwitch must be within the network segment of the VPC.</p>
     * <br>
     * <p>If you do not specify a value, the CIDR block 10.219.219.216/29 is automatically allocated.</p>
     * <br>
     * <p>>  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
     */
    @NameInMap("FirewallVSwitchCidrBlock")
    public String firewallVSwitchCidrBlock;

    /**
     * <p>The CIDR block of the VPC that is automatically created for the VPC firewall. You must specify a CIDR block for the Cloud_Firewall_VPC VPC that is automatically created for the VPC firewall for traffic redirection. The subnet mask of the CIDR block must be less than or equal to 28 bits in length.</p>
     * <br>
     * <p>If you do not specify a value, the CIDR block 10.0.0.0/8 is automatically allocated.</p>
     * <br>
     * <p>>  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region.</p>
     */
    @NameInMap("FirewallVpcCidrBlock")
    public String firewallVpcCidrBlock;

    /**
     * <p>The ID of the zone to which the vSwitch belongs. If your service is latency-sensitive, you can specify the same zone for the vSwitch of the firewall and the vSwitch of your business VPC to minimize latency.</p>
     * <br>
     * <p>If you do not specify a value, a zone is automatically assigned for the vSwitch.</p>
     * <br>
     * <p>>  This parameter takes effect only when you create a VPC firewall for the first time in the current CEN instance and region. For more information about zones that are supported by each region, see [Query zones](https://help.aliyun.com/document_detail/36064.html).</p>
     */
    @NameInMap("FirewallVpcZoneId")
    public String firewallVpcZoneId;

    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese (default)</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The UID of the member that is managed by your Alibaba Cloud account.</p>
     */
    @NameInMap("MemberUid")
    public String memberUid;

    /**
     * <p>The ID of the VPC for which you want to create the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkInstanceId")
    public String networkInstanceId;

    /**
     * <p>The ID of the vSwitch that is used to associate with the elastic network interface (ENI) required by the VPC firewall.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The instance name of the VPC firewall.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcFirewallName")
    public String vpcFirewallName;

    /**
     * <p>The ID of the region to which the VPC belongs.</p>
     * <br>
     * <p>> For more information about the regions, see [Supported regions](https://help.aliyun.com/document_detail/195657.html).</p>
     * <br>
     * <p>This parameter is required.</p>
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
