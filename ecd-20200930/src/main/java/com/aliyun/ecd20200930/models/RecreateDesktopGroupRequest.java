// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RecreateDesktopGroupRequest extends TeaModel {
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    @NameInMap("OwnBundleId")
    public String ownBundleId;

    @NameInMap("RegionId")
    public String regionId;

    public static RecreateDesktopGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        RecreateDesktopGroupRequest self = new RecreateDesktopGroupRequest();
        return TeaModel.build(map, self);
    }

    public RecreateDesktopGroupRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public RecreateDesktopGroupRequest setOwnBundleId(String ownBundleId) {
        this.ownBundleId = ownBundleId;
        return this;
    }
    public String getOwnBundleId() {
        return this.ownBundleId;
    }

    public RecreateDesktopGroupRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
