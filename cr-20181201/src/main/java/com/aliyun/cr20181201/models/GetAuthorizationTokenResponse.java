// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cr20181201.models;

import com.aliyun.tea.*;

public class GetAuthorizationTokenResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAuthorizationTokenResponseBody body;

    public static GetAuthorizationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAuthorizationTokenResponse self = new GetAuthorizationTokenResponse();
        return TeaModel.build(map, self);
    }

    public GetAuthorizationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAuthorizationTokenResponse setBody(GetAuthorizationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAuthorizationTokenResponseBody getBody() {
        return this.body;
    }

}
