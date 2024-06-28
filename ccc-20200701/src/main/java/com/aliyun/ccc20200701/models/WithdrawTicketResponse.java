// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class WithdrawTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public WithdrawTicketResponseBody body;

    public static WithdrawTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        WithdrawTicketResponse self = new WithdrawTicketResponse();
        return TeaModel.build(map, self);
    }

    public WithdrawTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public WithdrawTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public WithdrawTicketResponse setBody(WithdrawTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public WithdrawTicketResponseBody getBody() {
        return this.body;
    }

}
