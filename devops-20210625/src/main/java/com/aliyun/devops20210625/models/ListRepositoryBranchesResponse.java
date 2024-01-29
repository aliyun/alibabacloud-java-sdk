// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryBranchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ListRepositoryBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryBranchesResponse setBody(ListRepositoryBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryBranchesResponseBody getBody() {
        return this.body;
    }

}
