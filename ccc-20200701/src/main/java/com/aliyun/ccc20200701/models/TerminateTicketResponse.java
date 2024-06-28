// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TerminateTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateTicketResponseBody body;

    public static TerminateTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateTicketResponse self = new TerminateTicketResponse();
        return TeaModel.build(map, self);
    }

    public TerminateTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateTicketResponse setBody(TerminateTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateTicketResponseBody getBody() {
        return this.body;
    }

}
