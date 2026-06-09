// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class AnswerSSEResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

    @NameInMap("finish_reason")
    public String finishReason;

    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("input_tokens")
    public Integer inputTokens;

    @NameInMap("message")
    public String message;

    @NameInMap("output_tokens")
    public Integer outputTokens;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static AnswerSSEResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AnswerSSEResponseBody self = new AnswerSSEResponseBody();
        return TeaModel.build(map, self);
    }

    public AnswerSSEResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AnswerSSEResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public AnswerSSEResponseBody setFinishReason(String finishReason) {
        this.finishReason = finishReason;
        return this;
    }
    public String getFinishReason() {
        return this.finishReason;
    }

    public AnswerSSEResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AnswerSSEResponseBody setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public AnswerSSEResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AnswerSSEResponseBody setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public AnswerSSEResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AnswerSSEResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
