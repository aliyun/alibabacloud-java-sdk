// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicEndpointResponseBody body;

    public static CreateBasicEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointResponse self = new CreateBasicEndpointResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicEndpointResponse setBody(CreateBasicEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicEndpointResponseBody getBody() {
        return this.body;
    }

}
