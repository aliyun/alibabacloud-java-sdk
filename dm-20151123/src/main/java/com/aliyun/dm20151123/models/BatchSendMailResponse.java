// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class BatchSendMailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchSendMailResponseBody body;

    public static BatchSendMailResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchSendMailResponse self = new BatchSendMailResponse();
        return TeaModel.build(map, self);
    }

    public BatchSendMailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchSendMailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchSendMailResponse setBody(BatchSendMailResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchSendMailResponseBody getBody() {
        return this.body;
    }

}
