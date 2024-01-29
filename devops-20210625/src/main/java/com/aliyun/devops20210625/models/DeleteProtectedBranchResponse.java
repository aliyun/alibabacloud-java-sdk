// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeleteProtectedBranchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteProtectedBranchResponseBody body;

    public static DeleteProtectedBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProtectedBranchResponse self = new DeleteProtectedBranchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProtectedBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProtectedBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteProtectedBranchResponse setBody(DeleteProtectedBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProtectedBranchResponseBody getBody() {
        return this.body;
    }

}
