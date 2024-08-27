// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2RevocationEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OAuth2RevocationEndpointResponseBody body;

    public static OAuth2RevocationEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        OAuth2RevocationEndpointResponse self = new OAuth2RevocationEndpointResponse();
        return TeaModel.build(map, self);
    }

    public OAuth2RevocationEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OAuth2RevocationEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OAuth2RevocationEndpointResponse setBody(OAuth2RevocationEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public OAuth2RevocationEndpointResponseBody getBody() {
        return this.body;
    }

}
