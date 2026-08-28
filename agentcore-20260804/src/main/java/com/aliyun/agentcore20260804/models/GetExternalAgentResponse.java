// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetExternalAgentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExternalAgentResponseBody body;

    public static GetExternalAgentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExternalAgentResponse self = new GetExternalAgentResponse();
        return TeaModel.build(map, self);
    }

    public GetExternalAgentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExternalAgentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExternalAgentResponse setBody(GetExternalAgentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExternalAgentResponseBody getBody() {
        return this.body;
    }

}
