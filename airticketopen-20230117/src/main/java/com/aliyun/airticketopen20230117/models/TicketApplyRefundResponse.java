// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketApplyRefundResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketApplyRefundResponseBody body;

    public static TicketApplyRefundResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketApplyRefundResponse self = new TicketApplyRefundResponse();
        return TeaModel.build(map, self);
    }

    public TicketApplyRefundResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketApplyRefundResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketApplyRefundResponse setBody(TicketApplyRefundResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketApplyRefundResponseBody getBody() {
        return this.body;
    }

}
