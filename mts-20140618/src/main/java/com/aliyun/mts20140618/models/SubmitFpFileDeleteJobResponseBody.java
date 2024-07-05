// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpFileDeleteJobResponseBody extends TeaModel {
    /**
     * <p>The job ID.</p>
     * 
     * <strong>example:</strong>
     * <p>39f8e0bc005e4f309379701645f4****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D127C68E-F1A1-4CE5-A874-8FF724881A12</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitFpFileDeleteJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpFileDeleteJobResponseBody self = new SubmitFpFileDeleteJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFpFileDeleteJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFpFileDeleteJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
