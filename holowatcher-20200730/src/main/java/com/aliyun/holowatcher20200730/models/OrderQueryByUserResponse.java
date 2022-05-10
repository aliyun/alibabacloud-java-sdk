// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderQueryByUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderQueryByUserResponseBody body;

    public static OrderQueryByUserResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderQueryByUserResponse self = new OrderQueryByUserResponse();
        return TeaModel.build(map, self);
    }

    public OrderQueryByUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderQueryByUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderQueryByUserResponse setBody(OrderQueryByUserResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderQueryByUserResponseBody getBody() {
        return this.body;
    }

}
