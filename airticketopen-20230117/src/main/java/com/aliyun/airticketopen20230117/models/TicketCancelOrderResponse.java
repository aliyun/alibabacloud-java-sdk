// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCancelOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketCancelOrderResponseBody body;

    public static TicketCancelOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketCancelOrderResponse self = new TicketCancelOrderResponse();
        return TeaModel.build(map, self);
    }

    public TicketCancelOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketCancelOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketCancelOrderResponse setBody(TicketCancelOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketCancelOrderResponseBody getBody() {
        return this.body;
    }

}
