// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetExternalAgentBootstrapOptionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetExternalAgentBootstrapOptionsResponseBody body;

    public static GetExternalAgentBootstrapOptionsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetExternalAgentBootstrapOptionsResponse self = new GetExternalAgentBootstrapOptionsResponse();
        return TeaModel.build(map, self);
    }

    public GetExternalAgentBootstrapOptionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetExternalAgentBootstrapOptionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetExternalAgentBootstrapOptionsResponse setBody(GetExternalAgentBootstrapOptionsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetExternalAgentBootstrapOptionsResponseBody getBody() {
        return this.body;
    }

}
