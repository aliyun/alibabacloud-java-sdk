// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListProtectedBranchesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListProtectedBranchesResponseBody body;

    public static ListProtectedBranchesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListProtectedBranchesResponse self = new ListProtectedBranchesResponse();
        return TeaModel.build(map, self);
    }

    public ListProtectedBranchesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListProtectedBranchesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListProtectedBranchesResponse setBody(ListProtectedBranchesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListProtectedBranchesResponseBody getBody() {
        return this.body;
    }

}
