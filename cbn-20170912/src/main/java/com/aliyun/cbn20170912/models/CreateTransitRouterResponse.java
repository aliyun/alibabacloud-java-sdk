// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cbn20170912.models;

import com.aliyun.tea.*;

public class CreateTransitRouterResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateTransitRouterResponse setBody(CreateTransitRouterResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTransitRouterResponseBody getBody() {
        return this.body;
    }

}
