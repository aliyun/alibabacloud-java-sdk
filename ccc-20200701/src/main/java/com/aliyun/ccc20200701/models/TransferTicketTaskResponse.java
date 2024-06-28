// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class TransferTicketTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferTicketTaskResponseBody body;

    public static TransferTicketTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferTicketTaskResponse self = new TransferTicketTaskResponse();
        return TeaModel.build(map, self);
    }

    public TransferTicketTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferTicketTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferTicketTaskResponse setBody(TransferTicketTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferTicketTaskResponseBody getBody() {
        return this.body;
    }

}
