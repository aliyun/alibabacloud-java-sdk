// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPutKvResponseBody body;

    public static BatchPutKvResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvResponse self = new BatchPutKvResponse();
        return TeaModel.build(map, self);
    }

    public BatchPutKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPutKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPutKvResponse setBody(BatchPutKvResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPutKvResponseBody getBody() {
        return this.body;
    }

}
