// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteBranchResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteBranchResponseBody body;

    public static DeleteBranchResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteBranchResponse self = new DeleteBranchResponse();
        return TeaModel.build(map, self);
    }

    public DeleteBranchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteBranchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteBranchResponse setBody(DeleteBranchResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteBranchResponseBody getBody() {
        return this.body;
    }

}
