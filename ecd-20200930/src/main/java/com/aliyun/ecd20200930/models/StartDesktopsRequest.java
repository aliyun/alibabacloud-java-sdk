// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartDesktopsRequest extends TeaModel {
    /**
     * <p>StartDesktops</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The IDs of the cloud desktops. You can specify up to 100 IDs.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsRequest self = new StartDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public StartDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StartDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
