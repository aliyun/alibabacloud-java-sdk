// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTransitRouterResponseBody body;

    public static CreateTransitRouterResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTransitRouterResponse self = new CreateTransitRouterResponse();
        return TeaModel.build(map, self);
    }

    public CreateTransitRouterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTransitRouterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTransitRouterResponse setBody(CreateTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterResponseBody getBody() {
        return this.body;
    }

}
