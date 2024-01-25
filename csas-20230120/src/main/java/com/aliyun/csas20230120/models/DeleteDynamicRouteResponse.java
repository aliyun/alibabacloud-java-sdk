// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csas20230120.models;

import com.aliyun.tea.*;

public class DeleteDynamicRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDynamicRouteResponseBody body;

    public static DeleteDynamicRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDynamicRouteResponse self = new DeleteDynamicRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDynamicRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDynamicRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDynamicRouteResponse setBody(DeleteDynamicRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDynamicRouteResponseBody getBody() {
        return this.body;
    }

}
