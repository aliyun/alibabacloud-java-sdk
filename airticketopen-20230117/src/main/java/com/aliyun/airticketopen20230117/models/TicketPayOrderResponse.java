// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPayOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketPayOrderResponseBody body;

    public static TicketPayOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketPayOrderResponse self = new TicketPayOrderResponse();
        return TeaModel.build(map, self);
    }

    public TicketPayOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketPayOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketPayOrderResponse setBody(TicketPayOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketPayOrderResponseBody getBody() {
        return this.body;
    }

}
