// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class GetTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetTokenResponseBody body;

    public static GetTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTokenResponse self = new GetTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTokenResponse setBody(GetTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTokenResponseBody getBody() {
        return this.body;
    }

}
