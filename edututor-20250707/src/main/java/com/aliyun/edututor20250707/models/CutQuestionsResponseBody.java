// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edututor20250707.models;

import com.aliyun.tea.*;

public class CutQuestionsResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public String data;

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

    public static CutQuestionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CutQuestionsResponseBody self = new CutQuestionsResponseBody();
        return TeaModel.build(map, self);
    }

    public CutQuestionsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CutQuestionsResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CutQuestionsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public CutQuestionsResponseBody setInputTokens(Integer inputTokens) {
        this.inputTokens = inputTokens;
        return this;
    }
    public Integer getInputTokens() {
        return this.inputTokens;
    }

    public CutQuestionsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CutQuestionsResponseBody setOutputTokens(Integer outputTokens) {
        this.outputTokens = outputTokens;
        return this;
    }
    public Integer getOutputTokens() {
        return this.outputTokens;
    }

    public CutQuestionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CutQuestionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
