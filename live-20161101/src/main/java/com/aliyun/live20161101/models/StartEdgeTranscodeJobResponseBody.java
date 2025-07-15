// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartEdgeTranscodeJobResponseBody extends TeaModel {
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

    public static StartEdgeTranscodeJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartEdgeTranscodeJobResponseBody self = new StartEdgeTranscodeJobResponseBody();
        return TeaModel.build(map, self);
    }

    public StartEdgeTranscodeJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public StartEdgeTranscodeJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
