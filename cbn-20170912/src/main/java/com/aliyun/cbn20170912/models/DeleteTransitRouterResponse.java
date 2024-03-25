// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterResponseBody body;

    public static DeleteTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterResponse self = new DeleteTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterResponse setBody(DeleteTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterResponseBody getBody() {
        return this.body;
    }

}
