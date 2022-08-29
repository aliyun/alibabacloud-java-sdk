// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetTrustDaSqlJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetTrustDaSqlJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTrustDaSqlJobRequest self = new GetTrustDaSqlJobRequest();
        return TeaModel.build(map, self);
    }

    public GetTrustDaSqlJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
