// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class StopDtsJobsRequest extends TeaModel {
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

    @NameInMap("RegionId")
    public String regionId;

    public static StopDtsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        StopDtsJobsRequest self = new StopDtsJobsRequest();
        return TeaModel.build(map, self);
    }

    public StopDtsJobsRequest setDtsJobIds(String dtsJobIds) {
        this.dtsJobIds = dtsJobIds;
        return this;
    }
    public String getDtsJobIds() {
        return this.dtsJobIds;
    }

    public StopDtsJobsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
