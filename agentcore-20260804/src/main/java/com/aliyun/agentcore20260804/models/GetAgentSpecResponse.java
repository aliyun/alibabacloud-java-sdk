// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetAgentSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAgentSpecResponseBody body;

    public static GetAgentSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAgentSpecResponse self = new GetAgentSpecResponse();
        return TeaModel.build(map, self);
    }

    public GetAgentSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAgentSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAgentSpecResponse setBody(GetAgentSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAgentSpecResponseBody getBody() {
        return this.body;
    }

}
