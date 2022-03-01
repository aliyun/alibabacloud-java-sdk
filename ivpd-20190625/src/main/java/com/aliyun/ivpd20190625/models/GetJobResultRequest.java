// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ivpd20190625.models;

import com.aliyun.tea.*;

public class GetJobResultRequest extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    public static GetJobResultRequest build(java.util.Map<String, ?> map) throws Exception {
        GetJobResultRequest self = new GetJobResultRequest();
        return TeaModel.build(map, self);
    }

    public GetJobResultRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
