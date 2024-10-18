// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TransferTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferTicketResponseBody body;

    public static TransferTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferTicketResponse self = new TransferTicketResponse();
        return TeaModel.build(map, self);
    }

    public TransferTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferTicketResponse setBody(TransferTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferTicketResponseBody getBody() {
        return this.body;
    }

}
