// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateBasicEndpointsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateBasicEndpointsResponseBody body;

    public static CreateBasicEndpointsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateBasicEndpointsResponse self = new CreateBasicEndpointsResponse();
        return TeaModel.build(map, self);
    }

    public CreateBasicEndpointsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateBasicEndpointsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateBasicEndpointsResponse setBody(CreateBasicEndpointsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateBasicEndpointsResponseBody getBody() {
        return this.body;
    }

}
