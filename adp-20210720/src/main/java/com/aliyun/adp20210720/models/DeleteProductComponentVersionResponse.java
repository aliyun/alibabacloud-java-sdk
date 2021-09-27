// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteProductComponentVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductComponentVersionResponseBody body;

    public static DeleteProductComponentVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductComponentVersionResponse self = new DeleteProductComponentVersionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductComponentVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductComponentVersionResponse setBody(DeleteProductComponentVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductComponentVersionResponseBody getBody() {
        return this.body;
    }

}
