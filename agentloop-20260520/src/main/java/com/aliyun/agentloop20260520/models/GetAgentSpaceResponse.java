// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentloop20260520.models;

import com.aliyun.tea.*;

public class GetAgentSpaceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSpaceResponseBody body;

    public static GetAgentSpaceResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpaceResponse self = new GetAgentSpaceResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSpaceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSpaceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSpaceResponse setBody(GetAgentSpaceResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSpaceResponseBody getBody() {
        return this.body;
    }

}
