// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

import com.aliyun.tea.*;

public class RefreshTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RefreshTokenResponseBody body;

    public static RefreshTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        RefreshTokenResponse self = new RefreshTokenResponse();
        return TeaModel.build(map, self);
    }

    public RefreshTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RefreshTokenResponse setBody(RefreshTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public RefreshTokenResponseBody getBody() {
        return this.body;
    }

}
