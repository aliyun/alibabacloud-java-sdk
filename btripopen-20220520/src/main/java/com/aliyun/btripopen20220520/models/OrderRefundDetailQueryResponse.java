// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class OrderRefundDetailQueryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OrderRefundDetailQueryResponseBody body;

    public static OrderRefundDetailQueryResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderRefundDetailQueryResponse self = new OrderRefundDetailQueryResponse();
        return TeaModel.build(map, self);
    }

    public OrderRefundDetailQueryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderRefundDetailQueryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderRefundDetailQueryResponse setBody(OrderRefundDetailQueryResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderRefundDetailQueryResponseBody getBody() {
        return this.body;
    }

}
