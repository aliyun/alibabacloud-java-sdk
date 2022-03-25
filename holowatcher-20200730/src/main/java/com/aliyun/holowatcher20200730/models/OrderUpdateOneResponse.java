// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderUpdateOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderUpdateOneResponseBody body;

    public static OrderUpdateOneResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderUpdateOneResponse self = new OrderUpdateOneResponse();
        return TeaModel.build(map, self);
    }

    public OrderUpdateOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderUpdateOneResponse setBody(OrderUpdateOneResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderUpdateOneResponseBody getBody() {
        return this.body;
    }

}
