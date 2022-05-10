// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryOneAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQueryOneAppResponseBody body;

    public static OrderQueryOneAppResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryOneAppResponse self = new OrderQueryOneAppResponse();
        return TeaModel.build(map, self);
    }

    public OrderQueryOneAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQueryOneAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderQueryOneAppResponse setBody(OrderQueryOneAppResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQueryOneAppResponseBody getBody() {
        return this.body;
    }

}
