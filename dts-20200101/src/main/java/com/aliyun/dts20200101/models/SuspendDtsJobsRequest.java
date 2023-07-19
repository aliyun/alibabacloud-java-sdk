// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendDtsJobsRequest extends TeaModel {
    /**
     * <p>The ID of the data migration or data synchronization task.</p>
     * <br>
     * <p>> </p>
     * <p>*   For multiple tasks, separate them with commas (,).</p>
     * <p>*   You can call the [DescribeDtsJobs](~~209702~~) operation to query the task ID.</p>
     */
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    /**
     * <p>The ID of the region in which the DTS instance resides. For more information, see [List of supported regions](~~141033~~).</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static SuspendDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        SuspendDtsJobsRequest self = new SuspendDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public SuspendDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public SuspendDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
