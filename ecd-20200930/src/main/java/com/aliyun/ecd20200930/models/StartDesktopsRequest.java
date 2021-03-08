// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StartDesktopsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    public static StartDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDesktopsRequest self = new StartDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public StartDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StartDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

}
