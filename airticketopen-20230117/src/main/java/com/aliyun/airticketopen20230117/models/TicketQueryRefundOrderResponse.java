// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryRefundOrderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryRefundOrderResponseBody body;

    public static TicketQueryRefundOrderResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryRefundOrderResponse self = new TicketQueryRefundOrderResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryRefundOrderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryRefundOrderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryRefundOrderResponse setBody(TicketQueryRefundOrderResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryRefundOrderResponseBody getBody() {
        return this.body;
    }

}
