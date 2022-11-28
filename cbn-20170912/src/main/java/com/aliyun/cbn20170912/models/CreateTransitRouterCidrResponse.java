// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterCidrResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTransitRouterCidrResponseBody body;

    public static CreateTransitRouterCidrResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterCidrResponse self = new CreateTransitRouterCidrResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterCidrResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterCidrResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterCidrResponse setBody(CreateTransitRouterCidrResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterCidrResponseBody getBody() {
        return this.body;
    }

}
