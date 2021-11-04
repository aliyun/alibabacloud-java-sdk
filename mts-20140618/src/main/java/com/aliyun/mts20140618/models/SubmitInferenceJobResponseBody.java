// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInferenceJobResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TestId")
    public String testId;

    public static SubmitInferenceJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitInferenceJobResponseBody self = new SubmitInferenceJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitInferenceJobResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitInferenceJobResponseBody setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public SubmitInferenceJobResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitInferenceJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitInferenceJobResponseBody setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

}
