// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetMpcPrivateIdJobRequest extends TeaModel {
    @NameInMap("JobId")
    public Long jobId;

    public static GetMpcPrivateIdJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetMpcPrivateIdJobRequest self = new GetMpcPrivateIdJobRequest();
        return TeaModel.build(map, self);
    }

    public GetMpcPrivateIdJobRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

}
