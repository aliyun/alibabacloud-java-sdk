// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteCrossDesktopAccessRequest extends TeaModel {
    @NameInMap("EnableCrossDesktopAccess")
    public Boolean enableCrossDesktopAccess;

    /**
     * <p>ModifyOfficeSiteCrossDesktopAccess</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>Enables cross-desktop access in a workspace.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteCrossDesktopAccessRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteCrossDesktopAccessRequest self = new ModifyOfficeSiteCrossDesktopAccessRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setEnableCrossDesktopAccess(Boolean enableCrossDesktopAccess) {
        this.enableCrossDesktopAccess = enableCrossDesktopAccess;
        return this;
    }
    public Boolean getEnableCrossDesktopAccess() {
        return this.enableCrossDesktopAccess;
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteCrossDesktopAccessRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
