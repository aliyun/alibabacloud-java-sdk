// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class DeleteRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteRepoTagResponseBody body;

    public static DeleteRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepoTagResponse self = new DeleteRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepoTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteRepoTagResponse setBody(DeleteRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepoTagResponseBody getBody() {
        return this.body;
    }

}
