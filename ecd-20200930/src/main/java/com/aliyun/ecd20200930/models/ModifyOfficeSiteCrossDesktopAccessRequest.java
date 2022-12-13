// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteCrossDesktopAccessRequest extends TeaModel {
    // Specifies whether to enable cross-desktop access for a workspace.
    // 
    // *   true: enables cross-desktop access.
    // *   false: disables cross-desktop access.
    @NameInMap("EnableCrossDesktopAccess")
    public Boolean enableCrossDesktopAccess;

    // The ID of the workspace.
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    // The ID of the region.
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
