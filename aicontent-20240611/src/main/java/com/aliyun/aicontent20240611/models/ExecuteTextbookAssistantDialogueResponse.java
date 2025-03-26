// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantDialogueResponseBody body;

    public static ExecuteTextbookAssistantDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantDialogueResponse self = new ExecuteTextbookAssistantDialogueResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantDialogueResponse setBody(ExecuteTextbookAssistantDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantDialogueResponseBody getBody() {
        return this.body;
    }

}
