// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetRoutineRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRoutineRouteResponseBody body;

    public static GetRoutineRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRoutineRouteResponse self = new GetRoutineRouteResponse();
        return TeaModel.build(map, self);
    }

    public GetRoutineRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRoutineRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRoutineRouteResponse setBody(GetRoutineRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRoutineRouteResponseBody getBody() {
        return this.body;
    }

}
