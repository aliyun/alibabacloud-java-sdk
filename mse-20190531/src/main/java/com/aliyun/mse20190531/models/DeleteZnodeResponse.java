// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class DeleteZnodeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteZnodeResponseBody body;

    public static DeleteZnodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteZnodeResponse self = new DeleteZnodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteZnodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteZnodeResponse setBody(DeleteZnodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteZnodeResponseBody getBody() {
        return this.body;
    }

}
