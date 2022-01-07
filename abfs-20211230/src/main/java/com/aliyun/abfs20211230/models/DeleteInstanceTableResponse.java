// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.abfs20211230.models;

import com.aliyun.tea.*;

public class DeleteInstanceTableResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteInstanceTableResponseBody body;

    public static DeleteInstanceTableResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteInstanceTableResponse self = new DeleteInstanceTableResponse();
        return TeaModel.build(map, self);
    }

    public DeleteInstanceTableResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteInstanceTableResponse setBody(DeleteInstanceTableResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteInstanceTableResponseBody getBody() {
        return this.body;
    }

}
