// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeletePartitionsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeletePartitionsResponseBody body;

    public static BatchDeletePartitionsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeletePartitionsResponse self = new BatchDeletePartitionsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeletePartitionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeletePartitionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeletePartitionsResponse setBody(BatchDeletePartitionsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeletePartitionsResponseBody getBody() {
        return this.body;
    }

}
