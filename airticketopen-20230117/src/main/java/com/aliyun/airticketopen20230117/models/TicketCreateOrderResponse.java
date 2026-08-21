// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCreateOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketCreateOrderResponseBody body;

    public static TicketCreateOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketCreateOrderResponse self = new TicketCreateOrderResponse();
        return TeaModel.build(map, self);
    }

    public TicketCreateOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketCreateOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketCreateOrderResponse setBody(TicketCreateOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketCreateOrderResponseBody getBody() {
        return this.body;
    }

}
