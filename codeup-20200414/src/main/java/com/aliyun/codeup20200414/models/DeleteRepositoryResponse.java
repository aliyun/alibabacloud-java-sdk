// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryResponseBody body;

    public static DeleteRepositoryResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryResponse self = new DeleteRepositoryResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryResponse setBody(DeleteRepositoryResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryResponseBody getBody() {
        return this.body;
    }

}
