// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetManagedAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetManagedAgentResponseBody body;

    public static GetManagedAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetManagedAgentResponse self = new GetManagedAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetManagedAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetManagedAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetManagedAgentResponse setBody(GetManagedAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetManagedAgentResponseBody getBody() {
        return this.body;
    }

}
