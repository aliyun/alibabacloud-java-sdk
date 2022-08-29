// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlPredictionJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetTrustMlPredictionJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlPredictionJobRequest self = new GetTrustMlPredictionJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustMlPredictionJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
