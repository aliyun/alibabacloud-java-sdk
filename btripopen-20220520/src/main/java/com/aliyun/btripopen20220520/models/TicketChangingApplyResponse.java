// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class TicketChangingApplyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketChangingApplyResponseBody body;

    public static TicketChangingApplyResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketChangingApplyResponse self = new TicketChangingApplyResponse();
        return TeaModel.build(map, self);
    }

    public TicketChangingApplyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketChangingApplyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketChangingApplyResponse setBody(TicketChangingApplyResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketChangingApplyResponseBody getBody() {
        return this.body;
    }

}
