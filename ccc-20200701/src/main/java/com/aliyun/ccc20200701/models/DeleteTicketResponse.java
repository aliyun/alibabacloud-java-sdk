// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class DeleteTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTicketResponseBody body;

    public static DeleteTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTicketResponse self = new DeleteTicketResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTicketResponse setBody(DeleteTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTicketResponseBody getBody() {
        return this.body;
    }

}
