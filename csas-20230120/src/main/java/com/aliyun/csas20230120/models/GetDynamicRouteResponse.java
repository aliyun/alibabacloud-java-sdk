// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class GetDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetDynamicRouteResponseBody body;

    public static GetDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDynamicRouteResponse self = new GetDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDynamicRouteResponse setBody(GetDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
