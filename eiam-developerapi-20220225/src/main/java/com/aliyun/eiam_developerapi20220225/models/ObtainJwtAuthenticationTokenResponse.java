// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainJwtAuthenticationTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainJwtAuthenticationTokenResponseBody body;

    public static ObtainJwtAuthenticationTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainJwtAuthenticationTokenResponse self = new ObtainJwtAuthenticationTokenResponse();
        return TeaModel.build(map, self);
    }

    public ObtainJwtAuthenticationTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainJwtAuthenticationTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainJwtAuthenticationTokenResponse setBody(ObtainJwtAuthenticationTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainJwtAuthenticationTokenResponseBody getBody() {
        return this.body;
    }

}
