// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AssignTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AssignTicketResponseBody body;

    public static AssignTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        AssignTicketResponse self = new AssignTicketResponse();
        return TeaModel.build(map, self);
    }

    public AssignTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssignTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AssignTicketResponse setBody(AssignTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public AssignTicketResponseBody getBody() {
        return this.body;
    }

}
