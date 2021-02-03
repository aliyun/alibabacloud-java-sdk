// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSubtitleProduceJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitSubtitleProduceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSubtitleProduceJobResponseBody self = new SubmitSubtitleProduceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSubtitleProduceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSubtitleProduceJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
