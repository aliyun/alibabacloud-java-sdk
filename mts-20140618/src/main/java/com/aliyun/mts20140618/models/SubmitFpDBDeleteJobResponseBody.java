// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpDBDeleteJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the job. We recommend that you keep this ID for subsequent operation calls.</p>
     * 
     * <strong>example:</strong>
     * <p>d98459323c024947a104f6a50cbf****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>4247B23C-26DE-529F-8D9F-FD6811AE979B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitFpDBDeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpDBDeleteJobResponseBody self = new SubmitFpDBDeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFpDBDeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFpDBDeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
