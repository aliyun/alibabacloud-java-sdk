// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RegionId")
    public String regionId;

    public static GetMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMediaProducingJobRequest self = new GetMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMediaProducingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public GetMediaProducingJobRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
