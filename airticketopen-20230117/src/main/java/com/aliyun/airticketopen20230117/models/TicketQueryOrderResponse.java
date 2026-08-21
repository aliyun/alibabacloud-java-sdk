// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryOrderResponseBody body;

    public static TicketQueryOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryOrderResponse self = new TicketQueryOrderResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryOrderResponse setBody(TicketQueryOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryOrderResponseBody getBody() {
        return this.body;
    }

}
