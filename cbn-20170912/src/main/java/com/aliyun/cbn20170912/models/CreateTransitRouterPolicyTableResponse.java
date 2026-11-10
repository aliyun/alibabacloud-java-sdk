// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterPolicyTableResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterPolicyTableResponseBody body;

    public static CreateTransitRouterPolicyTableResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterPolicyTableResponse self = new CreateTransitRouterPolicyTableResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterPolicyTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterPolicyTableResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterPolicyTableResponse setBody(CreateTransitRouterPolicyTableResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterPolicyTableResponseBody getBody() {
        return this.body;
    }

}
