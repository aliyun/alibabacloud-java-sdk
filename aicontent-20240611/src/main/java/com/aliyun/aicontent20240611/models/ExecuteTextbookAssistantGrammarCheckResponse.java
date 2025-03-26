// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantGrammarCheckResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantGrammarCheckResponseBody body;

    public static ExecuteTextbookAssistantGrammarCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantGrammarCheckResponse self = new ExecuteTextbookAssistantGrammarCheckResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantGrammarCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantGrammarCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantGrammarCheckResponse setBody(ExecuteTextbookAssistantGrammarCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantGrammarCheckResponseBody getBody() {
        return this.body;
    }

}
