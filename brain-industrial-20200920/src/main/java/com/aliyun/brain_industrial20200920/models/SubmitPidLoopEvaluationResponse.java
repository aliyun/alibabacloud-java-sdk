// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.brain_industrial20200920.models;

import com.aliyun.tea.*;

public class SubmitPidLoopEvaluationResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Code")
    @Validation(required = true)
    public String code;

    @NameInMap("Message")
    @Validation(required = true)
    public String message;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    public static SubmitPidLoopEvaluationResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitPidLoopEvaluationResponse self = new SubmitPidLoopEvaluationResponse();
        return TeaModel.build(map, self);
    }

    public SubmitPidLoopEvaluationResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitPidLoopEvaluationResponse setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SubmitPidLoopEvaluationResponse setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SubmitPidLoopEvaluationResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
