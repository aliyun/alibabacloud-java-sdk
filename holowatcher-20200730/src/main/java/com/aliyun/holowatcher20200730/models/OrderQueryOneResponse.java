// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQueryOneResponseBody body;

    public static OrderQueryOneResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryOneResponse self = new OrderQueryOneResponse();
        return TeaModel.build(map, self);
    }

    public OrderQueryOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQueryOneResponse setBody(OrderQueryOneResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQueryOneResponseBody getBody() {
        return this.body;
    }

}
