// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class TransferRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TransferRepositoryResponseBody body;

    public static TransferRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        TransferRepositoryResponse self = new TransferRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public TransferRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TransferRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TransferRepositoryResponse setBody(TransferRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public TransferRepositoryResponseBody getBody() {
        return this.body;
    }

}
