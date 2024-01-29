// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListRepositoryCommitDiffResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListRepositoryCommitDiffResponseBody body;

    public static ListRepositoryCommitDiffResponse build(java.util.Map<String, ?> map) throws Exception {
        ListRepositoryCommitDiffResponse self = new ListRepositoryCommitDiffResponse();
        return TeaModel.build(map, self);
    }

    public ListRepositoryCommitDiffResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListRepositoryCommitDiffResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListRepositoryCommitDiffResponse setBody(ListRepositoryCommitDiffResponseBody body) {
        this.body = body;
        return this;
    }
    public ListRepositoryCommitDiffResponseBody getBody() {
        return this.body;
    }

}
