// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitAIAgentVideoAuditTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong><strong><strong>fb04483915d4f2</strong></strong></strong></strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p>**********-586A-AC29-742247******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitAIAgentVideoAuditTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitAIAgentVideoAuditTaskResponseBody self = new SubmitAIAgentVideoAuditTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitAIAgentVideoAuditTaskResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitAIAgentVideoAuditTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
