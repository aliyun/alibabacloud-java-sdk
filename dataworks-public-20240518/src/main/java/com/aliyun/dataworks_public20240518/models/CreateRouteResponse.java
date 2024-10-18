// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRouteResponseBody body;

    public static CreateRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRouteResponse self = new CreateRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRouteResponse setBody(CreateRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRouteResponseBody getBody() {
        return this.body;
    }

}
