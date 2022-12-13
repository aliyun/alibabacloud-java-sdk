// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GetDesktopGroupDetailRequest extends TeaModel {
    // The ID of the desktop group.
    @NameInMap("DesktopGroupId")
    public String desktopGroupId;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    public static GetDesktopGroupDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDesktopGroupDetailRequest self = new GetDesktopGroupDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetDesktopGroupDetailRequest setDesktopGroupId(String desktopGroupId) {
        this.desktopGroupId = desktopGroupId;
        return this;
    }
    public String getDesktopGroupId() {
        return this.desktopGroupId;
    }

    public GetDesktopGroupDetailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
