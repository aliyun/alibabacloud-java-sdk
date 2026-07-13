// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateServiceEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceEndpointResponseBody body;

    public static CreateServiceEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceEndpointResponse self = new CreateServiceEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceEndpointResponse setBody(CreateServiceEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceEndpointResponseBody getBody() {
        return this.body;
    }

}
