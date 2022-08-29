// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustMlTrainingJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetTrustMlTrainingJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustMlTrainingJobRequest self = new GetTrustMlTrainingJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustMlTrainingJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
