// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class HasActivateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HasActivateResponseBody body;

    public static HasActivateResponse build(java.util.Map<String, ?> map) throws Exception {
        HasActivateResponse self = new HasActivateResponse();
        return TeaModel.build(map, self);
    }

    public HasActivateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HasActivateResponse setBody(HasActivateResponseBody body) {
        this.body = body;
        return this;
    }
    public HasActivateResponseBody getBody() {
        return this.body;
    }

}
