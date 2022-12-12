// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class StartDiskMonitorRequest extends TeaModel {
    @NameInMap("DiskIds")
    public java.util.List<String> diskIds;

    @NameInMap("RegionId")
    public String regionId;

    public static StartDiskMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDiskMonitorRequest self = new StartDiskMonitorRequest();
        return TeaModel.build(map, self);
    }

    public StartDiskMonitorRequest setDiskIds(java.util.List<String> diskIds) {
        this.diskIds = diskIds;
        return this;
    }
    public java.util.List<String> getDiskIds() {
        return this.diskIds;
    }

    public StartDiskMonitorRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
