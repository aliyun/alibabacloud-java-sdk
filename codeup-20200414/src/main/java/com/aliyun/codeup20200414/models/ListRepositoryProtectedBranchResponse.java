// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryProtectedBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryProtectedBranchResponseBody body;

    public static ListRepositoryProtectedBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryProtectedBranchResponse self = new ListRepositoryProtectedBranchResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryProtectedBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryProtectedBranchResponse setBody(ListRepositoryProtectedBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryProtectedBranchResponseBody getBody() {
        return this.body;
    }

}
