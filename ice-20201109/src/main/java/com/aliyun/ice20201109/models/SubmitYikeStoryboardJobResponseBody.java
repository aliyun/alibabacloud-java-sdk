// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitYikeStoryboardJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitYikeStoryboardJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitYikeStoryboardJobResponseBody self = new SubmitYikeStoryboardJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitYikeStoryboardJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitYikeStoryboardJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
