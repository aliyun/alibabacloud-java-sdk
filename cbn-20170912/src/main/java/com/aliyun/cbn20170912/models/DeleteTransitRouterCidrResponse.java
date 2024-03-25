// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterCidrResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterCidrResponseBody body;

    public static DeleteTransitRouterCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterCidrResponse self = new DeleteTransitRouterCidrResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterCidrResponse setBody(DeleteTransitRouterCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterCidrResponseBody getBody() {
        return this.body;
    }

}
