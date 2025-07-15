// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateEdgeTranscodeJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the edge transcoding task.</p>
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
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static UpdateEdgeTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateEdgeTranscodeJobResponseBody self = new UpdateEdgeTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateEdgeTranscodeJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public UpdateEdgeTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
