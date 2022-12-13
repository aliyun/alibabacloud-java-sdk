// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeRequest extends TeaModel {
    // The method that is used to connect to cloud desktops. Valid values:
    // 
    // *   INTERNET: allows clients to connect to cloud desktops only over the Internet.
    // *   VPC: allows clients to connect to cloud desktops only over a virtual private cloud (VPC).
    // *   Any: allows clients to connect to cloud desktops over the Internet or a VPC. You can select a connection method when you use a client to connect to the cloud desktop.
    // 
    // Default value: INTERNET.
    // 
    // >  The VPC connection method depends on Alibaba Cloud PrivateLink. You can use PrivateLink for free. If you set this parameter to VPC or Any, PrivateLink is automatically activated.
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    // Specifies whether to enable two-step verification for logons. This is only used for workspaces of the convenience account type.
    // 
    // If two-step verification is enabled, the system checks whether the logon account has security risks when a convenience user logs on to a client. If the account has security risks, the system sends a verification code to the email address associated with the account. In this case, the convenience user can log on to the client only after the verification code is retrieved.
    @NameInMap("NeedVerifyLoginRisk")
    public Boolean needVerifyLoginRisk;

    @NameInMap("NeedVerifyZeroDevice")
    public Boolean needVerifyZeroDevice;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The name of the workspace.
    @NameInMap("OfficeSiteName")
    public String officeSiteName;

    // The ID of the region.
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
