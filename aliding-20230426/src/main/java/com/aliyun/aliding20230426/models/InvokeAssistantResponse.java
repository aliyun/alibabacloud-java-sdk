// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeAssistantResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeAssistantResponseBody body;

    public static InvokeAssistantResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAssistantResponse self = new InvokeAssistantResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAssistantResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeAssistantResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeAssistantResponse setBody(InvokeAssistantResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeAssistantResponseBody getBody() {
        return this.body;
    }

}
