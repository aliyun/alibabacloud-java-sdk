// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class DeleteTransitRouterPolicyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTransitRouterPolicyTableResponseBody body;

    public static DeleteTransitRouterPolicyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTransitRouterPolicyTableResponse self = new DeleteTransitRouterPolicyTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTransitRouterPolicyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTransitRouterPolicyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTransitRouterPolicyTableResponse setBody(DeleteTransitRouterPolicyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTransitRouterPolicyTableResponseBody getBody() {
        return this.body;
    }

}
