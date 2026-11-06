// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentVersionResponseBody body;

    public static GetAgentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentVersionResponse self = new GetAgentVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentVersionResponse setBody(GetAgentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentVersionResponseBody getBody() {
        return this.body;
    }

}
