// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSegmentationJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSegmentationJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSegmentationJobResponseBody self = new SubmitSegmentationJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSegmentationJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSegmentationJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
