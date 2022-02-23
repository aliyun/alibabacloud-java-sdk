// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class AddAuthenticatedUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAuthenticatedUserResponseBody body;

    public static AddAuthenticatedUserResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuthenticatedUserResponse self = new AddAuthenticatedUserResponse();
        return TeaModel.build(map, self);
    }

    public AddAuthenticatedUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuthenticatedUserResponse setBody(AddAuthenticatedUserResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuthenticatedUserResponseBody getBody() {
        return this.body;
    }

}
