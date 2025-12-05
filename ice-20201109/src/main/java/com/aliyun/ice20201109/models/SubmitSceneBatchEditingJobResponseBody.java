// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSceneBatchEditingJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>C702-41BE-467E-AF2E-883D4517</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSceneBatchEditingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSceneBatchEditingJobResponseBody self = new SubmitSceneBatchEditingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSceneBatchEditingJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSceneBatchEditingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
