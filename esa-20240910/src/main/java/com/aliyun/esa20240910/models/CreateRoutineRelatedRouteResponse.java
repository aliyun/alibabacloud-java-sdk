// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class CreateRoutineRelatedRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineRelatedRouteResponseBody body;

    public static CreateRoutineRelatedRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineRelatedRouteResponse self = new CreateRoutineRelatedRouteResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineRelatedRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineRelatedRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineRelatedRouteResponse setBody(CreateRoutineRelatedRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineRelatedRouteResponseBody getBody() {
        return this.body;
    }

}
