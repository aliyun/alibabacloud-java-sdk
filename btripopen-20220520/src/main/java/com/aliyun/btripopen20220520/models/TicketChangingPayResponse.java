// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingPayResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketChangingPayResponseBody body;

    public static TicketChangingPayResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingPayResponse self = new TicketChangingPayResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingPayResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingPayResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingPayResponse setBody(TicketChangingPayResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingPayResponseBody getBody() {
        return this.body;
    }

}
