// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class BatchDeleteModelsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteModelsResponseBody body;

    public static BatchDeleteModelsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteModelsResponse self = new BatchDeleteModelsResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteModelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteModelsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteModelsResponse setBody(BatchDeleteModelsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteModelsResponseBody getBody() {
        return this.body;
    }

}
