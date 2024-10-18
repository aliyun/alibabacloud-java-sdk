// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class FinishTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FinishTicketResponseBody body;

    public static FinishTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        FinishTicketResponse self = new FinishTicketResponse();
        return TeaModel.build(map, self);
    }

    public FinishTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FinishTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FinishTicketResponse setBody(FinishTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public FinishTicketResponseBody getBody() {
        return this.body;
    }

}
