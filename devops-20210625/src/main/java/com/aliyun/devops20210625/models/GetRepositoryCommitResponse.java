// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class GetRepositoryCommitResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetRepositoryCommitResponseBody body;

    public static GetRepositoryCommitResponse build(java.util.Map<String, ?> map) throws Exception {
        GetRepositoryCommitResponse self = new GetRepositoryCommitResponse();
        return TeaModel.build(map, self);
    }

    public GetRepositoryCommitResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetRepositoryCommitResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetRepositoryCommitResponse setBody(GetRepositoryCommitResponseBody body) {
        this.body = body;
        return this;
    }
    public GetRepositoryCommitResponseBody getBody() {
        return this.body;
    }

}
