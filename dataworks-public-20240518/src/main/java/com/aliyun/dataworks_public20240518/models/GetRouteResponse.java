// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class GetRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRouteResponseBody body;

    public static GetRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRouteResponse self = new GetRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRouteResponse setBody(GetRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRouteResponseBody getBody() {
        return this.body;
    }

}
