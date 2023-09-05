// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StopDiskMonitorRequest extends TeaModel {
    /**
     * <p>The IDs of the disks for which you want to disable near real-time monitoring.</p>
     */
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    /**
     * <p>The ID of the region in which you want to disable near real-time monitoring for disks. You can call the [DescribeRegions](~~354276~~) operation to query the list of regions that support CloudLens for EBS.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static StopDiskMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDiskMonitorRequest self = new StopDiskMonitorRequest();
        return TeaModel.build(map, self);
    }

    public StopDiskMonitorRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public StopDiskMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
