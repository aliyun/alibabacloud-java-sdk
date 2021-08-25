// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.lx20150701.models;

import com.aliyun.tea.*;

public class ValidateCreateOrderExpressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateCreateOrderExpressResponseBody body;

    public static ValidateCreateOrderExpressResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateCreateOrderExpressResponse self = new ValidateCreateOrderExpressResponse();
        return TeaModel.build(map, self);
    }

    public ValidateCreateOrderExpressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateCreateOrderExpressResponse setBody(ValidateCreateOrderExpressResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateCreateOrderExpressResponseBody getBody() {
        return this.body;
    }

}
