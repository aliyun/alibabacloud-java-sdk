// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class SuspendDtsJobsRequest extends TeaModel {
    @NameInMap("DtsJobIds")
    public String dtsJobIds;

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
