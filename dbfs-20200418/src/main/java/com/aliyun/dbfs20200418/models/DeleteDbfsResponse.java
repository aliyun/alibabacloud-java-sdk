// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class DeleteDbfsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDbfsResponseBody body;

    public static DeleteDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDbfsResponse self = new DeleteDbfsResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDbfsResponse setBody(DeleteDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDbfsResponseBody getBody() {
        return this.body;
    }

}
