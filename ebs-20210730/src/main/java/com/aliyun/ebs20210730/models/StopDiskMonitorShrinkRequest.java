// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskMonitorShrinkRequest extends TeaModel {
    @NameInMap("DiskIds")
    public String diskIdsShrink;

    @NameInMap("RegionId")
    public String regionId;

    public static StopDiskMonitorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDiskMonitorShrinkRequest self = new StopDiskMonitorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StopDiskMonitorShrinkRequest setDiskIdsShrink(String diskIdsShrink) {
        this.diskIdsShrink = diskIdsShrink;
        return this;
    }
    public String getDiskIdsShrink() {
        return this.diskIdsShrink;
    }

    public StopDiskMonitorShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
