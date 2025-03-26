// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class ExecuteTextbookAssistantRefineByContextResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteTextbookAssistantRefineByContextResponseBody body;

    public static ExecuteTextbookAssistantRefineByContextResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteTextbookAssistantRefineByContextResponse self = new ExecuteTextbookAssistantRefineByContextResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteTextbookAssistantRefineByContextResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteTextbookAssistantRefineByContextResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteTextbookAssistantRefineByContextResponse setBody(ExecuteTextbookAssistantRefineByContextResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteTextbookAssistantRefineByContextResponseBody getBody() {
        return this.body;
    }

}
