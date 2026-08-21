// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketQueryProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketQueryProductResponseBody body;

    public static TicketQueryProductResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketQueryProductResponse self = new TicketQueryProductResponse();
        return TeaModel.build(map, self);
    }

    public TicketQueryProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketQueryProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketQueryProductResponse setBody(TicketQueryProductResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketQueryProductResponseBody getBody() {
        return this.body;
    }

}
