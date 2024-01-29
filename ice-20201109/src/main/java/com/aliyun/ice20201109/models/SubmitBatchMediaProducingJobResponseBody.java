// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitBatchMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitBatchMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitBatchMediaProducingJobResponseBody self = new SubmitBatchMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitBatchMediaProducingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitBatchMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
