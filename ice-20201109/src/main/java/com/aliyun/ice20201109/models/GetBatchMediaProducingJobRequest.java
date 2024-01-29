// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetBatchMediaProducingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetBatchMediaProducingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBatchMediaProducingJobRequest self = new GetBatchMediaProducingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetBatchMediaProducingJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
