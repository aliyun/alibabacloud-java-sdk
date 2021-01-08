// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class ListRepositoryBranchesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListRepositoryBranchesResponseBody body;

    public static ListRepositoryBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryBranchesResponse self = new ListRepositoryBranchesResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryBranchesResponse setBody(ListRepositoryBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryBranchesResponseBody getBody() {
        return this.body;
    }

}
