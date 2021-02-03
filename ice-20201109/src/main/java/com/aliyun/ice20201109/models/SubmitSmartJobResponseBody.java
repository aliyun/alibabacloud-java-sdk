// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmartJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobId")
    public String jobId;

    public static SubmitSmartJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmartJobResponseBody self = new SubmitSmartJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmartJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitSmartJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
