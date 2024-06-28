// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class RejectTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RejectTicketResponseBody body;

    public static RejectTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        RejectTicketResponse self = new RejectTicketResponse();
        return TeaModel.build(map, self);
    }

    public RejectTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RejectTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RejectTicketResponse setBody(RejectTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public RejectTicketResponseBody getBody() {
        return this.body;
    }

}
