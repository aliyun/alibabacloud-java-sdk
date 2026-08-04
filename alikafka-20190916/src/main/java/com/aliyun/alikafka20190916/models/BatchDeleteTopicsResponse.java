// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class BatchDeleteTopicsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteTopicsResponseBody body;

    public static BatchDeleteTopicsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTopicsResponse self = new BatchDeleteTopicsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTopicsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteTopicsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteTopicsResponse setBody(BatchDeleteTopicsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteTopicsResponseBody getBody() {
        return this.body;
    }

}
