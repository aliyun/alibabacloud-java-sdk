// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class BatchUpdateFileMetaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateFileMetaResponseBody body;

    public static BatchUpdateFileMetaResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateFileMetaResponse self = new BatchUpdateFileMetaResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateFileMetaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateFileMetaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateFileMetaResponse setBody(BatchUpdateFileMetaResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateFileMetaResponseBody getBody() {
        return this.body;
    }

}
