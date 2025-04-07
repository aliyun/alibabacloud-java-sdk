// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineRouteResponseBody body;

    public static CreateRoutineRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRouteResponse self = new CreateRoutineRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineRouteResponse setBody(CreateRoutineRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineRouteResponseBody getBody() {
        return this.body;
    }

}
