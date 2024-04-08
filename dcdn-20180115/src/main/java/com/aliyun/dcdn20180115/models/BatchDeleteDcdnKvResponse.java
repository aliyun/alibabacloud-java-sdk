// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDcdnKvResponseBody body;

    public static BatchDeleteDcdnKvResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvResponse self = new BatchDeleteDcdnKvResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDcdnKvResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDcdnKvResponse setBody(BatchDeleteDcdnKvResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDcdnKvResponseBody getBody() {
        return this.body;
    }

}
