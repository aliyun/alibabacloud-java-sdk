// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetServiceEndpointApiKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceEndpointApiKeyResponseBody body;

    public static GetServiceEndpointApiKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointApiKeyResponse self = new GetServiceEndpointApiKeyResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointApiKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceEndpointApiKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceEndpointApiKeyResponse setBody(GetServiceEndpointApiKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceEndpointApiKeyResponseBody getBody() {
        return this.body;
    }

}
