// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class CreateHttpApiRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateHttpApiRouteResponseBody body;

    public static CreateHttpApiRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateHttpApiRouteResponse self = new CreateHttpApiRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateHttpApiRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateHttpApiRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateHttpApiRouteResponse setBody(CreateHttpApiRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateHttpApiRouteResponseBody getBody() {
        return this.body;
    }

}
