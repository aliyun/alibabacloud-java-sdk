// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantRetryConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantRetryConversationResponseBody body;

    public static ExecuteTextbookAssistantRetryConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantRetryConversationResponse self = new ExecuteTextbookAssistantRetryConversationResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantRetryConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantRetryConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantRetryConversationResponse setBody(ExecuteTextbookAssistantRetryConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantRetryConversationResponseBody getBody() {
        return this.body;
    }

}
