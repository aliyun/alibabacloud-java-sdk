// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitFpShotJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the media fingerprint analysis job. We recommend that you keep this ID for subsequent operation calls.</p>
     * 
     * <strong>example:</strong>
     * <p>2a0697e35a7342859f733a9190c4****</p>
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

    public static SubmitFpShotJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitFpShotJobResponseBody self = new SubmitFpShotJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitFpShotJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitFpShotJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
