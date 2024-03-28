// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateCustomRoutingEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomRoutingEndpointsResponseBody body;

    public static CreateCustomRoutingEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoutingEndpointsResponse self = new CreateCustomRoutingEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoutingEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomRoutingEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomRoutingEndpointsResponse setBody(CreateCustomRoutingEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomRoutingEndpointsResponseBody getBody() {
        return this.body;
    }

}
