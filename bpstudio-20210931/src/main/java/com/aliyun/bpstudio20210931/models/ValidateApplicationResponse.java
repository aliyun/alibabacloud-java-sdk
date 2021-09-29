// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ValidateApplicationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ValidateApplicationResponseBody body;

    public static ValidateApplicationResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidateApplicationResponse self = new ValidateApplicationResponse();
        return TeaModel.build(map, self);
    }

    public ValidateApplicationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidateApplicationResponse setBody(ValidateApplicationResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidateApplicationResponseBody getBody() {
        return this.body;
    }

}
