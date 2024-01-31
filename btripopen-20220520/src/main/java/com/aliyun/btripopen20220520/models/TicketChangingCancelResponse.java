// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingCancelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketChangingCancelResponseBody body;

    public static TicketChangingCancelResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingCancelResponse self = new TicketChangingCancelResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingCancelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingCancelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingCancelResponse setBody(TicketChangingCancelResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingCancelResponseBody getBody() {
        return this.body;
    }

}
