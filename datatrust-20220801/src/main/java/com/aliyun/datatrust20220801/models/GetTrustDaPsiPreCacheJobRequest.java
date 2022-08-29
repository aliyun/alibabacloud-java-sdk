// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaPsiPreCacheJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetTrustDaPsiPreCacheJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaPsiPreCacheJobRequest self = new GetTrustDaPsiPreCacheJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustDaPsiPreCacheJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
