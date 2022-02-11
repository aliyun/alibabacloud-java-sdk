// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StartDtsJobsRequest extends TeaModel {
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    @NameInMap("RegionId")
    public String regionId;

    public static StartDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StartDtsJobsRequest self = new StartDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public StartDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public StartDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
