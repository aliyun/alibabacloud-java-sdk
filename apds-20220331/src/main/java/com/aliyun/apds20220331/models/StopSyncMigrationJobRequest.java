// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class StopSyncMigrationJobRequest extends TeaModel {
    @NameInMap("jobType")
    public String jobType;

    @NameInMap("regionId")
    public String regionId;

    public static StopSyncMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        StopSyncMigrationJobRequest self = new StopSyncMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public StopSyncMigrationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public StopSyncMigrationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
