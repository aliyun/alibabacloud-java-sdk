// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class TicketingCheckResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public TicketingCheckResponseBody body;

    public static TicketingCheckResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketingCheckResponse self = new TicketingCheckResponse();
        return TeaModel.build(map, self);
    }

    public TicketingCheckResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketingCheckResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketingCheckResponse setBody(TicketingCheckResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketingCheckResponseBody getBody() {
        return this.body;
    }

}
