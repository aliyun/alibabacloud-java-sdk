// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetTrustDaPsiJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiJobRequest self = new GetTrustDaPsiJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
