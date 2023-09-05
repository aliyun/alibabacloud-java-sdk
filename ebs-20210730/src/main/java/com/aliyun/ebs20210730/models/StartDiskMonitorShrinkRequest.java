// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskMonitorShrinkRequest extends TeaModel {
    /**
     * <p>The IDs of the disks for which you want to enable near real-time monitoring.</p>
     */
    @NameInMap("DiskIds")
    public String diskIdsShrink;

    /**
     * <p>The ID of the region in which you want to enable near real-time monitoring for disks. You can call the [DescribeRegions](~~354276~~) operation to query the list of regions that support CloudLens for EBS.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StartDiskMonitorShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDiskMonitorShrinkRequest self = new StartDiskMonitorShrinkRequest();
        return TeaModel.build(map, self);
    }

    public StartDiskMonitorShrinkRequest setDiskIdsShrink(String diskIdsShrink) {
        this.diskIdsShrink = diskIdsShrink;
        return this;
    }
    public String getDiskIdsShrink() {
        return this.diskIdsShrink;
    }

    public StartDiskMonitorShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
