// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteRepositoryMemberResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepositoryMemberResponseBody body;

    public static DeleteRepositoryMemberResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryMemberResponse self = new DeleteRepositoryMemberResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryMemberResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryMemberResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepositoryMemberResponse setBody(DeleteRepositoryMemberResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryMemberResponseBody getBody() {
        return this.body;
    }

}
