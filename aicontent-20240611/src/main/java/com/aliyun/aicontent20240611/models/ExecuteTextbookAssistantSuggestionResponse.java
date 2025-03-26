// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSuggestionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantSuggestionResponseBody body;

    public static ExecuteTextbookAssistantSuggestionResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSuggestionResponse self = new ExecuteTextbookAssistantSuggestionResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSuggestionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantSuggestionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantSuggestionResponse setBody(ExecuteTextbookAssistantSuggestionResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantSuggestionResponseBody getBody() {
        return this.body;
    }

}
