// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketCheckRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketCheckRefundResponseBody body;

    public static TicketCheckRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketCheckRefundResponse self = new TicketCheckRefundResponse();
        return TeaModel.build(map, self);
    }

    public TicketCheckRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketCheckRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketCheckRefundResponse setBody(TicketCheckRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketCheckRefundResponseBody getBody() {
        return this.body;
    }

}
