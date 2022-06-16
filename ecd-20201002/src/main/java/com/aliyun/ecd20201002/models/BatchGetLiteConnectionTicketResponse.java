// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20201002.models;

import com.aliyun.tea.*;

public class BatchGetLiteConnectionTicketResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public BatchGetLiteConnectionTicketResponseBody body;

    public static BatchGetLiteConnectionTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetLiteConnectionTicketResponse self = new BatchGetLiteConnectionTicketResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetLiteConnectionTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetLiteConnectionTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetLiteConnectionTicketResponse setBody(BatchGetLiteConnectionTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetLiteConnectionTicketResponseBody getBody() {
        return this.body;
    }

}
