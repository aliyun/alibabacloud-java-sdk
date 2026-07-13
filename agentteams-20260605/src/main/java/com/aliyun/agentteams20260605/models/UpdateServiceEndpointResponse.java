// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class UpdateServiceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateServiceEndpointResponseBody body;

    public static UpdateServiceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateServiceEndpointResponse self = new UpdateServiceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public UpdateServiceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateServiceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateServiceEndpointResponse setBody(UpdateServiceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateServiceEndpointResponseBody getBody() {
        return this.body;
    }

}
