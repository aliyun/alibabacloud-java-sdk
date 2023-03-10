// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderListResponseBody body;

    public static OrderListResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderListResponse self = new OrderListResponse();
        return TeaModel.build(map, self);
    }

    public OrderListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderListResponse setBody(OrderListResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderListResponseBody getBody() {
        return this.body;
    }

}
