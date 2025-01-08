// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class BatchGetAcpConnectionTicketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetAcpConnectionTicketResponseBody body;

    public static BatchGetAcpConnectionTicketResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetAcpConnectionTicketResponse self = new BatchGetAcpConnectionTicketResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetAcpConnectionTicketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetAcpConnectionTicketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetAcpConnectionTicketResponse setBody(BatchGetAcpConnectionTicketResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetAcpConnectionTicketResponseBody getBody() {
        return this.body;
    }

}
