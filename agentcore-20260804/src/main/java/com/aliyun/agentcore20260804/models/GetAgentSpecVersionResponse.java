// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSpecVersionResponseBody body;

    public static GetAgentSpecVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecVersionResponse self = new GetAgentSpecVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSpecVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSpecVersionResponse setBody(GetAgentSpecVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSpecVersionResponseBody getBody() {
        return this.body;
    }

}
