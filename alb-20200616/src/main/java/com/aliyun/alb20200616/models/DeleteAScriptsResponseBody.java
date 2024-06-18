// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DeleteAScriptsResponseBody extends TeaModel {
    /**
     * <p>The asynchronous task ID.</p>
     * 
     * <strong>example:</strong>
     * <p>03cf3fe1-ab37-479b-92a6-b481d762****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1B7B7695-3596-50C8-B739-030C6C685E61</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DeleteAScriptsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteAScriptsResponseBody self = new DeleteAScriptsResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteAScriptsResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DeleteAScriptsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
