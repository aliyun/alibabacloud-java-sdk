// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ebs20210730.models;

import com.aliyun.tea.*;

public class GetDiskRequest extends TeaModel {
    /**
     * <p>The ID of the disk.</p>
     */
    @NameInMap("DiskId")
    public String diskId;

    /**
     * <p>The region ID of the disk.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static GetDiskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetDiskRequest self = new GetDiskRequest();
        return TeaModel.build(map, self);
    }

    public GetDiskRequest setDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }
    public String getDiskId() {
        return this.diskId;
    }

    public GetDiskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
