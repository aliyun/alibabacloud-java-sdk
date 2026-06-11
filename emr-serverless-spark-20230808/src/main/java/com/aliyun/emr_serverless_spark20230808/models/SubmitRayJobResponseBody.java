// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class SubmitRayJobResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>rj-k7nm8ahl5te4tg91</p>
     */
    @NameInMap("submissionId")
    public String submissionId;

    public static SubmitRayJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitRayJobResponseBody self = new SubmitRayJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitRayJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitRayJobResponseBody setSubmissionId(String submissionId) {
        this.submissionId = submissionId;
        return this;
    }
    public String getSubmissionId() {
        return this.submissionId;
    }

}
