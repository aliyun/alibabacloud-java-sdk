// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryProtectedBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepositoryProtectedBranchResponseBody body;

    public static CreateRepositoryProtectedBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryProtectedBranchResponse self = new CreateRepositoryProtectedBranchResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryProtectedBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepositoryProtectedBranchResponse setBody(CreateRepositoryProtectedBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepositoryProtectedBranchResponseBody getBody() {
        return this.body;
    }

}
