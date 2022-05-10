// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class OrderBatchCreateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderBatchCreateResponseBody body;

    public static OrderBatchCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderBatchCreateResponse self = new OrderBatchCreateResponse();
        return TeaModel.build(map, self);
    }

    public OrderBatchCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderBatchCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderBatchCreateResponse setBody(OrderBatchCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderBatchCreateResponseBody getBody() {
        return this.body;
    }

}
