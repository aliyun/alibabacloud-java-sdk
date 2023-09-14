// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAScriptsResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateAScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateAScriptsResponseBody self = new UpdateAScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateAScriptsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateAScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
