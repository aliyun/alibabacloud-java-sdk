// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class OrderDetailResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderDetailResponseBody body;

    public static OrderDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderDetailResponse self = new OrderDetailResponse();
        return TeaModel.build(map, self);
    }

    public OrderDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderDetailResponse setBody(OrderDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderDetailResponseBody getBody() {
        return this.body;
    }

}
