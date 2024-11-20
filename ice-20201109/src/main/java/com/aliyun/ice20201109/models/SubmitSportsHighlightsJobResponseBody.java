// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSportsHighlightsJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the sports highlights job.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>d80e4e4044975745c14b</strong></strong></p>
     */
    @NameInMap("JobId")
    public String jobId;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>36-3C1E-4417-BDB2-1E034F</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSportsHighlightsJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSportsHighlightsJobResponseBody self = new SubmitSportsHighlightsJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSportsHighlightsJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSportsHighlightsJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
