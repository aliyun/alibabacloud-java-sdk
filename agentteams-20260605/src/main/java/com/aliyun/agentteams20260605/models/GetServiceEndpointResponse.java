// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class GetServiceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetServiceEndpointResponseBody body;

    public static GetServiceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        GetServiceEndpointResponse self = new GetServiceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public GetServiceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetServiceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetServiceEndpointResponse setBody(GetServiceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public GetServiceEndpointResponseBody getBody() {
        return this.body;
    }

}
