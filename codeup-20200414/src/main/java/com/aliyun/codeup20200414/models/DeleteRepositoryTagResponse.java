// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class DeleteRepositoryTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteRepositoryTagResponseBody body;

    public static DeleteRepositoryTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteRepositoryTagResponse self = new DeleteRepositoryTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteRepositoryTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteRepositoryTagResponse setBody(DeleteRepositoryTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteRepositoryTagResponseBody getBody() {
        return this.body;
    }

}
