// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepositoryResponseBody body;

    public static DeleteRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryResponse self = new DeleteRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepositoryResponse setBody(DeleteRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryResponseBody getBody() {
        return this.body;
    }

}
