// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cd2021127.models;

import com.aliyun.tea.*;

public class DeleteProductImageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductImageResponseBody body;

    public static DeleteProductImageResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductImageResponse self = new DeleteProductImageResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductImageResponse setBody(DeleteProductImageResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductImageResponseBody getBody() {
        return this.body;
    }

}
