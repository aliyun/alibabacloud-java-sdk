// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQueryStatusResponseBody body;

    public static OrderQueryStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryStatusResponse self = new OrderQueryStatusResponse();
        return TeaModel.build(map, self);
    }

    public OrderQueryStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQueryStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderQueryStatusResponse setBody(OrderQueryStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQueryStatusResponseBody getBody() {
        return this.body;
    }

}
