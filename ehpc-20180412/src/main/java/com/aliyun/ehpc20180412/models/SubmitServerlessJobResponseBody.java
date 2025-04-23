// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the serverless job.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitServerlessJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitServerlessJobResponseBody self = new SubmitServerlessJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitServerlessJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitServerlessJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
