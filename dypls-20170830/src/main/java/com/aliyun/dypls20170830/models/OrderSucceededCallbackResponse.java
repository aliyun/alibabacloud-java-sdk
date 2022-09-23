// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypls20170830.models;

import com.aliyun.tea.*;

public class OrderSucceededCallbackResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public OrderSucceededCallbackResponseBody body;

    public static OrderSucceededCallbackResponse build(java.util.Map<String, ?> map) throws Exception {
        OrderSucceededCallbackResponse self = new OrderSucceededCallbackResponse();
        return TeaModel.build(map, self);
    }

    public OrderSucceededCallbackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OrderSucceededCallbackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OrderSucceededCallbackResponse setBody(OrderSucceededCallbackResponseBody body) {
        this.body = body;
        return this;
    }
    public OrderSucceededCallbackResponseBody getBody() {
        return this.body;
    }

}
