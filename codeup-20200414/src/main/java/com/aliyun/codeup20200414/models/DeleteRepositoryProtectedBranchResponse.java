// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryProtectedBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryProtectedBranchResponseBody body;

    public static DeleteRepositoryProtectedBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryProtectedBranchResponse self = new DeleteRepositoryProtectedBranchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryProtectedBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryProtectedBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepositoryProtectedBranchResponse setBody(DeleteRepositoryProtectedBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryProtectedBranchResponseBody getBody() {
        return this.body;
    }

}
