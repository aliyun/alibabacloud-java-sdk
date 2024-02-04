// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchGetFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetFileMetaResponseBody body;

    public static BatchGetFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetFileMetaResponse self = new BatchGetFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetFileMetaResponse setBody(BatchGetFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetFileMetaResponseBody getBody() {
        return this.body;
    }

}
