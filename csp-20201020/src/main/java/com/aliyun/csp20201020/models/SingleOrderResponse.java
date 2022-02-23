// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class SingleOrderResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SingleOrderResponseBody body;

    public static SingleOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        SingleOrderResponse self = new SingleOrderResponse();
        return TeaModel.build(map, self);
    }

    public SingleOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SingleOrderResponse setBody(SingleOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public SingleOrderResponseBody getBody() {
        return this.body;
    }

}
