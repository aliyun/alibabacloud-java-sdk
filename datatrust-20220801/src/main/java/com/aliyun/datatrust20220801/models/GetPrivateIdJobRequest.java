// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetPrivateIdJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetPrivateIdJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrivateIdJobRequest self = new GetPrivateIdJobRequest();
        return TeaModel.build(map, self);
    }

    public GetPrivateIdJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
