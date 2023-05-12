// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class StopDesktopsRequest extends TeaModel {
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The operation that you want to perform. Set the value to StopDesktops.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>StopDesktops</p>
     */
    @NameInMap("StoppedMode")
    public String stoppedMode;

    public static StopDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDesktopsRequest self = new StopDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public StopDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public StopDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public StopDesktopsRequest setStoppedMode(String stoppedMode) {
        this.stoppedMode = stoppedMode;
        return this;
    }
    public String getStoppedMode() {
        return this.stoppedMode;
    }

}
