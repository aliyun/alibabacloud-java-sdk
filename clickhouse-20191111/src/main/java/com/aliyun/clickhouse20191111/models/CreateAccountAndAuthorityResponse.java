// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class CreateAccountAndAuthorityResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateAccountAndAuthorityResponseBody body;

    public static CreateAccountAndAuthorityResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccountAndAuthorityResponse self = new CreateAccountAndAuthorityResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccountAndAuthorityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccountAndAuthorityResponse setBody(CreateAccountAndAuthorityResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccountAndAuthorityResponseBody getBody() {
        return this.body;
    }

}
