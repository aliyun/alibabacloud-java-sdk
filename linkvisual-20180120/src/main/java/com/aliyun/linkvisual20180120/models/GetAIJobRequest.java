// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkvisual20180120.models;

import com.aliyun.tea.*;

public class GetAIJobRequest extends TeaModel {
    @NameInMap("JobId")
    @Validation(required = true)
    public String jobId;

    public static GetAIJobRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAIJobRequest self = new GetAIJobRequest();
        return TeaModel.build(map, self);
    }

    public GetAIJobRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
