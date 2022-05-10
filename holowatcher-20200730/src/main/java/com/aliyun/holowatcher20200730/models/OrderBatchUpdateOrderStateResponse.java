// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderBatchUpdateOrderStateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderBatchUpdateOrderStateResponseBody body;

    public static OrderBatchUpdateOrderStateResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderBatchUpdateOrderStateResponse self = new OrderBatchUpdateOrderStateResponse();
        return TeaModel.build(map, self);
    }

    public OrderBatchUpdateOrderStateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderBatchUpdateOrderStateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderBatchUpdateOrderStateResponse setBody(OrderBatchUpdateOrderStateResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderBatchUpdateOrderStateResponseBody getBody() {
        return this.body;
    }

}
