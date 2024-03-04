// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitTextGenerateJobResponseBody extends TeaModel {
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitTextGenerateJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitTextGenerateJobResponseBody self = new SubmitTextGenerateJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitTextGenerateJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitTextGenerateJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
