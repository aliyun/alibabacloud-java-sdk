// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.linkedmall20230930.models;

import com.aliyun.tea.*;

public class GetOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OrderResult body;

    public static GetOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOrderResponse self = new GetOrderResponse();
        return TeaModel.build(map, self);
    }

    public GetOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOrderResponse setBody(OrderResult body) {
        this.body = body;
        return this;
    }
    public OrderResult getBody() {
        return this.body;
    }

}
