// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteRouteMapResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRouteMapResponseBody body;

    public static DeleteRouteMapResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRouteMapResponse self = new DeleteRouteMapResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRouteMapResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRouteMapResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRouteMapResponse setBody(DeleteRouteMapResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRouteMapResponseBody getBody() {
        return this.body;
    }

}
