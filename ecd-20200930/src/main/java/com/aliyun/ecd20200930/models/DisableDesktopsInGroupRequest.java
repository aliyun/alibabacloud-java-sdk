// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DisableDesktopsInGroupRequest extends TeaModel {
    /**
     * <p>The ID of the desktop group.</p>
     */
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    /**
     * <p>The IDs of the cloud desktops.</p>
     */
    @NameInMap("DesktopIds")
    public java.util.List<String> desktopIds;

    /**
     * <p>The ID of the region.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static DisableDesktopsInGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DisableDesktopsInGroupRequest self = new DisableDesktopsInGroupRequest();
        return TeaModel.build(map, self);
    }

    public DisableDesktopsInGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public DisableDesktopsInGroupRequest setDesktopIds(java.util.List<String> desktopIds) {
        this.desktopIds = desktopIds;
        return this;
    }
    public java.util.List<String> getDesktopIds() {
        return this.desktopIds;
    }

    public DisableDesktopsInGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
