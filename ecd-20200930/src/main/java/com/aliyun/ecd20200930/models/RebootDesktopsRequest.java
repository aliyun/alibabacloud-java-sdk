// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RebootDesktopsRequest extends TeaModel {
    /**
     * <p>The cloud desktop ID. You can specify one or more desktop IDs. Valid values of N: 1 to 100.</p>
     */
    @NameInMap("DesktopId")
    public java.util.List<String> desktopId;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static RebootDesktopsRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootDesktopsRequest self = new RebootDesktopsRequest();
        return TeaModel.build(map, self);
    }

    public RebootDesktopsRequest setDesktopId(java.util.List<String> desktopId) {
        this.desktopId = desktopId;
        return this;
    }
    public java.util.List<String> getDesktopId() {
        return this.desktopId;
    }

    public RebootDesktopsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
