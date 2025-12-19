// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentitydata20251127.models;

import com.aliyun.tea.*;

public class GetResourceOAuth2TokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetResourceOAuth2TokenResponseBody body;

    public static GetResourceOAuth2TokenResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceOAuth2TokenResponse self = new GetResourceOAuth2TokenResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceOAuth2TokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceOAuth2TokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceOAuth2TokenResponse setBody(GetResourceOAuth2TokenResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceOAuth2TokenResponseBody getBody() {
        return this.body;
    }

}
