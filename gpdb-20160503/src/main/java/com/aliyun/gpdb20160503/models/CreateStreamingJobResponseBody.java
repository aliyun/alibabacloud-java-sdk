// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class CreateStreamingJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public Integer jobId;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateStreamingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateStreamingJobResponseBody self = new CreateStreamingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateStreamingJobResponseBody setJobId(Integer jobId) {
        this.jobId = jobId;
        return this;
    }
    public Integer getJobId() {
        return this.jobId;
    }

    public CreateStreamingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
