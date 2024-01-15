// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class CreateSimpleOfficeSiteRequest extends TeaModel {
    /**
     * <p>The maximum public bandwidth. Value range: 10 to 200. Unit: Mbit/s. This parameter is available if you set `EnableInternetAccess` to `true`.</p>
     */
    @NameInMap("Bandwidth")
    public Integer bandwidth;

    /**
     * <p>The ID of the Cloud Enterprise Network (CEN) instance.</p>
     * <br>
     * <p>> If you want to connect to your cloud desktops over a VPC, you can attach the network of the workspace to the CEN instance. The CEN instance is connected to the on-premises network over VPN Gateway or Express Connect.</p>
     */
    @NameInMap("CenId")
    public String cenId;

    /**
     * <p>The ID of the Alibaba Cloud account to which the Cloud Enterprise Network (CEN) instance belongs.</p>
     * <br>
     * <p>- If you do not specify the CenId parameter, or the CEN instance that is specified by the CenId parameter belongs to the current Alibaba Cloud account, skip this parameter.</p>
     * <p>- If you specify the CenId parameter and the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, enter the ID of the Alibaba Cloud account.</p>
     */
    @NameInMap("CenOwnerId")
    public Long cenOwnerId;

    /**
     * <p>The IPv4 CIDR block in the secure office network of the workspace. The IPv4 CIDR block that the system uses to create a virtual private cloud (VPC) for the workspace. We recommend that you set the IPv4 CIDR block to 10.0.0.0/12, 172.16.0.0/12, 192.168.0.0/16, or a subnet of these CIDR blocks. If you set the IPv4 CIDR block to 10.0.0.0/12 or 172.16.0.0/12, the mask is 1224 bits in length. If you set the IPv4 CIDR block to 192.168.0.0/16, the mask is 1624 bits in length.</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>Specifies whether the workspace is a CloudBox-based workspace.</p>
     */
    @NameInMap("CloudBoxOfficeSite")
    public Boolean cloudBoxOfficeSite;

    /**
     * <p>The method that is used to connect the client to cloud desktops.</p>
     * <br>
     * <p>> VPC connections are established by using Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to VPC or Any, PrivateLink is automatically activated.</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>Specifies whether to grant the permissions of the local administrator to the regular user of the cloud desktop.</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable Internet access. By default, Internet access is not enabled.</p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable trusted device verification.</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The name of the workspace. The name must be 2 to 255 characters in length. It must start with a letter and cannot start with `http://` or `https://`. The name can contain letters, digits, colons (:), underscores (\_), and hyphens (-).</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the vSwitches in the VPC. This parameter is required when you create a CloudBox-based workspace.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the [SendVerifyCode](~~335132~~) operation to obtain the verification code.</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    @NameInMap("VpcType")
    public String vpcType;

    public static CreateSimpleOfficeSiteRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSimpleOfficeSiteRequest self = new CreateSimpleOfficeSiteRequest();
        return TeaModel.build(map, self);
    }

    public CreateSimpleOfficeSiteRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateSimpleOfficeSiteRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateSimpleOfficeSiteRequest setCenOwnerId(Long cenOwnerId) {
        this.cenOwnerId = cenOwnerId;
        return this;
    }
    public Long getCenOwnerId() {
        return this.cenOwnerId;
    }

    public CreateSimpleOfficeSiteRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateSimpleOfficeSiteRequest setCloudBoxOfficeSite(Boolean cloudBoxOfficeSite) {
        this.cloudBoxOfficeSite = cloudBoxOfficeSite;
        return this;
    }
    public Boolean getCloudBoxOfficeSite() {
        return this.cloudBoxOfficeSite;
    }

    public CreateSimpleOfficeSiteRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public CreateSimpleOfficeSiteRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public CreateSimpleOfficeSiteRequest setEnableInternetAccess(Boolean enableInternetAccess) {
        this.enableInternetAccess = enableInternetAccess;
        return this;
    }
    public Boolean getEnableInternetAccess() {
        return this.enableInternetAccess;
    }

    public CreateSimpleOfficeSiteRequest setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
        this.needVerifyZeroDevice = needVerifyZeroDevice;
        return this;
    }
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    public CreateSimpleOfficeSiteRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public CreateSimpleOfficeSiteRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSimpleOfficeSiteRequest setVSwitchId(java.util.List<String> vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public java.util.List<String> getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateSimpleOfficeSiteRequest setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
        return this;
    }
    public String getVerifyCode() {
        return this.verifyCode;
    }

    public CreateSimpleOfficeSiteRequest setVpcType(String vpcType) {
        this.vpcType = vpcType;
        return this;
    }
    public String getVpcType() {
        return this.vpcType;
    }

}
