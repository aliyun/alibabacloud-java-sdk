// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteRoutineRelatedRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRoutineRelatedRouteResponseBody body;

    public static DeleteRoutineRelatedRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRoutineRelatedRouteResponse self = new DeleteRoutineRelatedRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRoutineRelatedRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRoutineRelatedRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRoutineRelatedRouteResponse setBody(DeleteRoutineRelatedRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRoutineRelatedRouteResponseBody getBody() {
        return this.body;
    }

}
