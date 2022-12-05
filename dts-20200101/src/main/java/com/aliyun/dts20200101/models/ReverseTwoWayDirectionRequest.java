// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dts20200101.models;

import com.aliyun.tea.*;

public class ReverseTwoWayDirectionRequest extends TeaModel {
    @NameInMap("DtsInstanceId")
    public String dtsInstanceId;

    @NameInMap("IgnoreErrorSubJob")
    public Boolean ignoreErrorSubJob;

    @NameInMap("RegionId")
    public String regionId;

    public static ReverseTwoWayDirectionRequest build(java.util.Map<String, ?> map) throws Exception {
        ReverseTwoWayDirectionRequest self = new ReverseTwoWayDirectionRequest();
        return TeaModel.build(map, self);
    }

    public ReverseTwoWayDirectionRequest setDtsInstanceId(String dtsInstanceId) {
        this.dtsInstanceId = dtsInstanceId;
        return this;
    }
    public String getDtsInstanceId() {
        return this.dtsInstanceId;
    }

    public ReverseTwoWayDirectionRequest setIgnoreErrorSubJob(Boolean ignoreErrorSubJob) {
        this.ignoreErrorSubJob = ignoreErrorSubJob;
        return this;
    }
    public Boolean getIgnoreErrorSubJob() {
        return this.ignoreErrorSubJob;
    }

    public ReverseTwoWayDirectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
