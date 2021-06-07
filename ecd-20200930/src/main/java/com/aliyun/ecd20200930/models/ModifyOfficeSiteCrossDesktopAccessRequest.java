// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteCrossDesktopAccessRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("OfficeSiteId")
    @Validation(required = true)
    public String officeSiteId;

    @NameInMap("EnableCrossDesktopAccess")
    @Validation(required = true)
    public Boolean enableCrossDesktopAccess;

    public static ModifyOfficeSiteCrossDesktopAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteCrossDesktopAccessRequest self = new ModifyOfficeSiteCrossDesktopAccessRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
        this.enableCrossDesktopAccess = enableCrossDesktopAccess;
        return this;
    }
    public Boolean getEnableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }

}
