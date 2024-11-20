// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class SubmitSmarttagJobResponseBody extends TeaModel {
    /**
     * <p>The ID of the smart tagging job. We recommend that you save this ID for subsequent calls of other operations.</p>
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
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitSmarttagJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitSmarttagJobResponseBody self = new SubmitSmarttagJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitSmarttagJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitSmarttagJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
