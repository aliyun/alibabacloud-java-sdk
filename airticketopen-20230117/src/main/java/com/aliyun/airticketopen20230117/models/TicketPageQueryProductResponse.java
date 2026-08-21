// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketPageQueryProductResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketPageQueryProductResponseBody body;

    public static TicketPageQueryProductResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketPageQueryProductResponse self = new TicketPageQueryProductResponse();
        return TeaModel.build(map, self);
    }

    public TicketPageQueryProductResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketPageQueryProductResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketPageQueryProductResponse setBody(TicketPageQueryProductResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketPageQueryProductResponseBody getBody() {
        return this.body;
    }

}
