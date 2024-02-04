// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchDeleteFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteFileMetaResponseBody body;

    public static BatchDeleteFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteFileMetaResponse self = new BatchDeleteFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteFileMetaResponse setBody(BatchDeleteFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteFileMetaResponseBody getBody() {
        return this.body;
    }

}
