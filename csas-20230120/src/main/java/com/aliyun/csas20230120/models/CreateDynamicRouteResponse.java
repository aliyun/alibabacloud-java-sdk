// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class CreateDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDynamicRouteResponseBody body;

    public static CreateDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDynamicRouteResponse self = new CreateDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDynamicRouteResponse setBody(CreateDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
