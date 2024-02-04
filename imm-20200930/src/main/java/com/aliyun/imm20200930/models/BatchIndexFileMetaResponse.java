// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchIndexFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchIndexFileMetaResponseBody body;

    public static BatchIndexFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchIndexFileMetaResponse self = new BatchIndexFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public BatchIndexFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchIndexFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchIndexFileMetaResponse setBody(BatchIndexFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchIndexFileMetaResponseBody getBody() {
        return this.body;
    }

}
