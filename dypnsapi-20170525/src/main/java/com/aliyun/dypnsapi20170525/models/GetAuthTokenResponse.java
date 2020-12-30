// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dypnsapi20170525.models;

import com.aliyun.tea.*;

public class GetAuthTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthTokenResponseBody body;

    public static GetAuthTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthTokenResponse self = new GetAuthTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthTokenResponse setBody(GetAuthTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthTokenResponseBody getBody() {
        return this.body;
    }

}
