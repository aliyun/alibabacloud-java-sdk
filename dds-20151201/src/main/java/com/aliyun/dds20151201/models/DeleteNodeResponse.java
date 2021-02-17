// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dds20151201.models;

import com.aliyun.tea.*;

public class DeleteNodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteNodeResponseBody body;

    public static DeleteNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteNodeResponse self = new DeleteNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteNodeResponse setBody(DeleteNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteNodeResponseBody getBody() {
        return this.body;
    }

}
