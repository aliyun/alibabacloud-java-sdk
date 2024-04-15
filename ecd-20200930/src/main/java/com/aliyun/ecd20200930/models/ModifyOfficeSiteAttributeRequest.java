// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeRequest extends TeaModel {
    /**
     * <p>The method to connect to cloud computers from WUYING clients.</p>
     * <br>
     * <p>>  VPC connection relies on the Alibaba Cloud PrivateLink service. You can use PrivateLink for free. When you set this parameter to `VPC` or `Any`, the system automatically activates PrivateLink.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   INTERNET (default): allows end users to connect to cloud computers over the Internet.</p>
     * <p>*   VPC: allows end users to connect to cloud computers over VPCs.</p>
     * <p>*   ANY: allows end users to connect to cloud computers over the Internet and VPCs. When end users connect to cloud computers from WUYING clients, you can choose a connection method based on your business requirements.</p>
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
     * <p>Specifies whether to enable two-factor verification when an end user logs on to a WUYING client. This parameter is required only for convenience office networks. If two-factor verification is enabled, the system checks whether security risks exist within the logon account when the end user uses a convenience user to log on to the client. If risks are detected, the system sends a verification code to the email address that is associated with the account of the convenience user. Then, the end user can log on to the client only when the verification code is correct.</p>
     */
    @NameInMap("NeedVerifyLoginRisk")
    public Boolean needVerifyLoginRisk;

    /**
     * <p>Specifies whether to enable device verification. This parameter is required only for convenience office networks. This parameter is left empty for enterprise Active Directory (AD) office networks.</p>
     */
    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    /**
     * <p>The office network ID.</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The office network name. The name must be 2 to 255 characters in length. It can contain letters, digits, colons (:), underscores (\_), periods (.), and hyphens (-). It must start with a letter and cannot start with `http://` or `https://`.\</p>
     * <p>This parameter is empty by default.</p>
     */
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    /**
     * <p>The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteAttributeRequest self = new ModifyOfficeSiteAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteAttributeRequest setDesktopAccessType(String desktopAccessType) {
        this.desktopAccessType = desktopAccessType;
        return this;
    }
    public String getDesktopAccessType() {
        return this.desktopAccessType;
    }

    public ModifyOfficeSiteAttributeRequest setEnableAdminAccess(Boolean enableAdminAccess) {
        this.enableAdminAccess = enableAdminAccess;
        return this;
    }
    public Boolean getEnableAdminAccess() {
        return this.enableAdminAccess;
    }

    public ModifyOfficeSiteAttributeRequest setNeedVerifyLoginRisk(Boolean needVerifyLoginRisk) {
        this.needVerifyLoginRisk = needVerifyLoginRisk;
        return this;
    }
    public Boolean getNeedVerifyLoginRisk() {
        return this.needVerifyLoginRisk;
    }

    public ModifyOfficeSiteAttributeRequest setNeedVerifyZeroDevice(Boolean needVerifyZeroDevice) {
        this.needVerifyZeroDevice = needVerifyZeroDevice;
        return this;
    }
    public Boolean getNeedVerifyZeroDevice() {
        return this.needVerifyZeroDevice;
    }

    public ModifyOfficeSiteAttributeRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteAttributeRequest setOfficeSiteName(String officeSiteName) {
        this.officeSiteName = officeSiteName;
        return this;
    }
    public String getOfficeSiteName() {
        return this.officeSiteName;
    }

    public ModifyOfficeSiteAttributeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
