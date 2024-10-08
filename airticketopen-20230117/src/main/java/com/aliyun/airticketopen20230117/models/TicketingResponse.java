// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketingResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketingResponseBody body;

    public static TicketingResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketingResponse self = new TicketingResponse();
        return TeaModel.build(map, self);
    }

    public TicketingResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketingResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketingResponse setBody(TicketingResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketingResponseBody getBody() {
        return this.body;
    }

}
