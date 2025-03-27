// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantSseDialogueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantSseDialogueResponseBody body;

    public static ExecuteTextbookAssistantSseDialogueResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantSseDialogueResponse self = new ExecuteTextbookAssistantSseDialogueResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantSseDialogueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantSseDialogueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantSseDialogueResponse setBody(ExecuteTextbookAssistantSseDialogueResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantSseDialogueResponseBody getBody() {
        return this.body;
    }

}
