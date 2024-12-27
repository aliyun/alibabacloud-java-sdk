// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteAITeacherGrammarCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteAITeacherGrammarCheckResponseBody body;

    public static ExecuteAITeacherGrammarCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAITeacherGrammarCheckResponse self = new ExecuteAITeacherGrammarCheckResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteAITeacherGrammarCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteAITeacherGrammarCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteAITeacherGrammarCheckResponse setBody(ExecuteAITeacherGrammarCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteAITeacherGrammarCheckResponseBody getBody() {
        return this.body;
    }

}
