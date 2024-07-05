// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the content moderation job. We recommend that you keep this ID for subsequent operation calls.</p>
     * 
     * <strong>example:</strong>
     * <p>88c6ca184c0e47098a5b665e2****</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A13-BEF6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaCensorJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobResponseBody self = new SubmitMediaCensorJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitMediaCensorJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
