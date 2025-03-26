// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantStartConversationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantStartConversationResponseBody body;

    public static ExecuteTextbookAssistantStartConversationResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantStartConversationResponse self = new ExecuteTextbookAssistantStartConversationResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantStartConversationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantStartConversationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantStartConversationResponse setBody(ExecuteTextbookAssistantStartConversationResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantStartConversationResponseBody getBody() {
        return this.body;
    }

}
