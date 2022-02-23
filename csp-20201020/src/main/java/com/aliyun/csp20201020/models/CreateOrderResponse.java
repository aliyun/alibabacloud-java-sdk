// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrderResponseBody body;

    public static CreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrderResponse self = new CreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrderResponse setBody(CreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrderResponseBody getBody() {
        return this.body;
    }

}
