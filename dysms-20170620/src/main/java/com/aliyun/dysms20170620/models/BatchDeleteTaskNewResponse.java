// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dysms20170620.models;

import com.aliyun.tea.*;

public class BatchDeleteTaskNewResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteTaskNewResponseBody body;

    public static BatchDeleteTaskNewResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTaskNewResponse self = new BatchDeleteTaskNewResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTaskNewResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteTaskNewResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteTaskNewResponse setBody(BatchDeleteTaskNewResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteTaskNewResponseBody getBody() {
        return this.body;
    }

}
