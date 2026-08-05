// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.kms20160120.models;

import com.aliyun.tea.*;

public class BatchGetSecretValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchGetSecretValueResponseBody body;

    public static BatchGetSecretValueResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchGetSecretValueResponse self = new BatchGetSecretValueResponse();
        return TeaModel.build(map, self);
    }

    public BatchGetSecretValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchGetSecretValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchGetSecretValueResponse setBody(BatchGetSecretValueResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchGetSecretValueResponseBody getBody() {
        return this.body;
    }

}
