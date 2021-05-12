// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class DeleteProductComponentResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteProductComponentResponseBody body;

    public static DeleteProductComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteProductComponentResponse self = new DeleteProductComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteProductComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteProductComponentResponse setBody(DeleteProductComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteProductComponentResponseBody getBody() {
        return this.body;
    }

}
