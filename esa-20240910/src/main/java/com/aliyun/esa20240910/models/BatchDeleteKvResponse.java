// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteKvResponseBody body;

    public static BatchDeleteKvResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteKvResponse self = new BatchDeleteKvResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteKvResponse setBody(BatchDeleteKvResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteKvResponseBody getBody() {
        return this.body;
    }

}
