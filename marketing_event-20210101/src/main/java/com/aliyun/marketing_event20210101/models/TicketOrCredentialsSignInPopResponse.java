// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.marketing_event20210101.models;

import com.aliyun.tea.*;

public class TicketOrCredentialsSignInPopResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TicketOrCredentialsSignInPopResponseBody body;

    public static TicketOrCredentialsSignInPopResponse build(java.util.Map<String, ?> map) throws Exception {
        TicketOrCredentialsSignInPopResponse self = new TicketOrCredentialsSignInPopResponse();
        return TeaModel.build(map, self);
    }

    public TicketOrCredentialsSignInPopResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TicketOrCredentialsSignInPopResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TicketOrCredentialsSignInPopResponse setBody(TicketOrCredentialsSignInPopResponseBody body) {
        this.body = body;
        return this;
    }
    public TicketOrCredentialsSignInPopResponseBody getBody() {
        return this.body;
    }

}
