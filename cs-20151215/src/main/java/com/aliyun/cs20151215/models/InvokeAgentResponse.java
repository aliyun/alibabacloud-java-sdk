// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class InvokeAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeAgentResponseBody body;

    public static InvokeAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeAgentResponse self = new InvokeAgentResponse();
        return TeaModel.build(map, self);
    }

    public InvokeAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeAgentResponse setBody(InvokeAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeAgentResponseBody getBody() {
        return this.body;
    }

}
