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
     * <p>The Cloud Enterprise Network (CEN) instance ID.</p>
     * <br>
     * <p>>  If you want end users to connect to cloud computers from WUYING clients over VPCs, you can attach the office network to a CEN instance. The CEN instance is the one that connects to your on-premises network over VPN Gateway or Express Connect.</p>
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
     * <p>The IPv4 CIDR block that you want the office network to use in the virtual private cloud (VPC) of the office network. The system automatically creates a VPC for the office network based on the IPv4 CIDR block. We recommend that you set this parameter to one of the following CIDR blocks and their subnets:</p>
     * <br>
     * <p>*   `10.0.0.0/12` (subnet mask range: 12 to 14 bits)</p>
     * <p>*   `172.16.0.0/12` (subnet mask range: 12 to 24 bits)</p>
     * <p>*   `192.168.0.0/16` (subnet mask range: 16 to 24 bits)</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>Specifies whether to create a CloudBox-based office network.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("CloudBoxOfficeSite")
    public Boolean cloudBoxOfficeSite;

    /**
     * <p>The method to connect to cloud computers from WUYING clients.</p>
     * <br>
     * <p>>  The VPC connection depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. When you set this parameter to VPC or Any, PrivateLink is automatically activated.````</p>
     */
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    /**
     * <p>Specifies whether to grant the local administrator permissions to users that are authorized to use cloud computers in the office network.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>* true (default)</p>
     * <p>* false</p>
     */
    @NameInMap("EnableAdminAccess")
    public Boolean enableAdminAccess;

    /**
     * <p>Specifies whether to enable Internet access.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false (default)</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("EnableInternetAccess")
    public Boolean enableInternetAccess;

    /**
     * <p>Specifies whether to enable trusted device verification.</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The office network name. The name must be 2 to 255 characters in length. It can contain digits, colons (:), underscores (\_), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The IDs of the vSwitches that you want to specify in VPCs. This parameter is required only when you create CloudBox-based office networks.</p>
     */
    @NameInMap("VSwitchId")
    public java.util.List<String> vSwitchId;

    /**
     * <p>The verification code. If the CEN instance that you specify for the CenId parameter belongs to another Alibaba Cloud account, you must call the [SendVerifyCode](~~335132~~) operation to obtain the verification code.</p>
     */
    @NameInMap("VerifyCode")
    public String verifyCode;

    /**
     * <p>The network type of the office network.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   standard: advanced</p>
     * <p>*   basic: basic</p>
     */
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
