// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class DeleteRouteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteResponseBody body;

    public static DeleteRouteResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteResponse self = new DeleteRouteResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteResponse setBody(DeleteRouteResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteResponseBody getBody() {
        return this.body;
    }

}
