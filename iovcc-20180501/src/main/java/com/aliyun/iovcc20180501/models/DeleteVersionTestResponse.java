// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iovcc20180501.models;

import com.aliyun.tea.*;

public class DeleteVersionTestResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteVersionTestResponseBody body;

    public static DeleteVersionTestResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteVersionTestResponse self = new DeleteVersionTestResponse();
        return TeaModel.build(map, self);
    }

    public DeleteVersionTestResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteVersionTestResponse setBody(DeleteVersionTestResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteVersionTestResponseBody getBody() {
        return this.body;
    }

}
