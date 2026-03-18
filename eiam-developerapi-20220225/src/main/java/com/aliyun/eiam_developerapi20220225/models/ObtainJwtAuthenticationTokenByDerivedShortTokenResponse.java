// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam_developerapi20220225.models;

import com.aliyun.tea.*;

public class ObtainJwtAuthenticationTokenByDerivedShortTokenResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ObtainJwtAuthenticationTokenByDerivedShortTokenResponseBody body;

    public static ObtainJwtAuthenticationTokenByDerivedShortTokenResponse build(java.util.Map<String, ?> map) throws Exception {
        ObtainJwtAuthenticationTokenByDerivedShortTokenResponse self = new ObtainJwtAuthenticationTokenByDerivedShortTokenResponse();
        return TeaModel.build(map, self);
    }

    public ObtainJwtAuthenticationTokenByDerivedShortTokenResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ObtainJwtAuthenticationTokenByDerivedShortTokenResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ObtainJwtAuthenticationTokenByDerivedShortTokenResponse setBody(ObtainJwtAuthenticationTokenByDerivedShortTokenResponseBody body) {
        this.body = body;
        return this;
    }
    public ObtainJwtAuthenticationTokenByDerivedShortTokenResponseBody getBody() {
        return this.body;
    }

}
