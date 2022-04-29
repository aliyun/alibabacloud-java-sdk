// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OrderCreateResponseBody body;

    public static OrderCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderCreateResponse self = new OrderCreateResponse();
        return TeaModel.build(map, self);
    }

    public OrderCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderCreateResponse setBody(OrderCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderCreateResponseBody getBody() {
        return this.body;
    }

}
