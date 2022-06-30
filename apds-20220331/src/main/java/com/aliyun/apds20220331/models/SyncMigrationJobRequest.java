// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apds20220331.models;

import com.aliyun.tea.*;

public class SyncMigrationJobRequest extends TeaModel {
    @NameInMap("jobType")
    public String jobType;

    @NameInMap("regionId")
    public String regionId;

    @NameInMap("regions")
    public String regions;

    public static SyncMigrationJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SyncMigrationJobRequest self = new SyncMigrationJobRequest();
        return TeaModel.build(map, self);
    }

    public SyncMigrationJobRequest setJobType(String jobType) {
        this.jobType = jobType;
        return this;
    }
    public String getJobType() {
        return this.jobType;
    }

    public SyncMigrationJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SyncMigrationJobRequest setRegions(String regions) {
        this.regions = regions;
        return this;
    }
    public String getRegions() {
        return this.regions;
    }

}
