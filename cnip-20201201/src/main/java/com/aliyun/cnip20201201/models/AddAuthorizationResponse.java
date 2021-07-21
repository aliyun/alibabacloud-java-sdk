// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cnip20201201.models;

import com.aliyun.tea.*;

public class AddAuthorizationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AddAuthorizationResponseBody body;

    public static AddAuthorizationResponse build(java.util.Map<String, ?> map) throws Exception {
        AddAuthorizationResponse self = new AddAuthorizationResponse();
        return TeaModel.build(map, self);
    }

    public AddAuthorizationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddAuthorizationResponse setBody(AddAuthorizationResponseBody body) {
        this.body = body;
        return this;
    }
    public AddAuthorizationResponseBody getBody() {
        return this.body;
    }

}
