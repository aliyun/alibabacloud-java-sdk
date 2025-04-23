// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>1.manager</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobResponseBody self = new SubmitJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
