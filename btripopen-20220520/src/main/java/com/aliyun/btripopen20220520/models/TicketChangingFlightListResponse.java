// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingFlightListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketChangingFlightListResponseBody body;

    public static TicketChangingFlightListResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingFlightListResponse self = new TicketChangingFlightListResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingFlightListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingFlightListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingFlightListResponse setBody(TicketChangingFlightListResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingFlightListResponseBody getBody() {
        return this.body;
    }

}
