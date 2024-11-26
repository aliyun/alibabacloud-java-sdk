// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class GetHttpApiRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetHttpApiRouteResponseBody body;

    public static GetHttpApiRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetHttpApiRouteResponse self = new GetHttpApiRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetHttpApiRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetHttpApiRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetHttpApiRouteResponse setBody(GetHttpApiRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetHttpApiRouteResponseBody getBody() {
        return this.body;
    }

}
