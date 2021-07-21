// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductVersionConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductVersionConfigResponseBody body;

    public static DeleteProductVersionConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductVersionConfigResponse self = new DeleteProductVersionConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductVersionConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductVersionConfigResponse setBody(DeleteProductVersionConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductVersionConfigResponseBody getBody() {
        return this.body;
    }

}
