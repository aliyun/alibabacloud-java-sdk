// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class DeleteClassResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteClassResponseBody body;

    public static DeleteClassResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteClassResponse self = new DeleteClassResponse();
        return TeaModel.build(map, self);
    }

    public DeleteClassResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteClassResponse setBody(DeleteClassResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteClassResponseBody getBody() {
        return this.body;
    }

}
