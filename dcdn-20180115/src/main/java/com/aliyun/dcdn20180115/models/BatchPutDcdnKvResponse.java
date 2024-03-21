// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPutDcdnKvResponseBody body;

    public static BatchPutDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvResponse self = new BatchPutDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPutDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPutDcdnKvResponse setBody(BatchPutDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPutDcdnKvResponseBody getBody() {
        return this.body;
    }

}
