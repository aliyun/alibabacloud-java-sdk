// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteAttributeRequest extends TeaModel {
    @NameInMap("DesktopAccessType")
    public String desktopAccessType;

    @NameInMap("NeedVerifyLoginRisk")
    public Boolean needVerifyLoginRisk;

    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    @NameInMap("OfficeSiteName")
    public String officeSiteName;

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
