// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.miniapplcdp20200113.models;

import com.aliyun.tea.*;

public class GenerateAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GenerateAuthTokenResponseBody body;

    public static GenerateAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateAuthTokenResponse self = new GenerateAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GenerateAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateAuthTokenResponse setBody(GenerateAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateAuthTokenResponseBody getBody() {
        return this.body;
    }

}
