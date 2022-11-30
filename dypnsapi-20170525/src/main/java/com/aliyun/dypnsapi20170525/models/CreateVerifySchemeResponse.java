// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class CreateVerifySchemeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateVerifySchemeResponseBody body;

    public static CreateVerifySchemeResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVerifySchemeResponse self = new CreateVerifySchemeResponse();
        return TeaModel.build(map, self);
    }

    public CreateVerifySchemeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVerifySchemeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVerifySchemeResponse setBody(CreateVerifySchemeResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVerifySchemeResponseBody getBody() {
        return this.body;
    }

}
