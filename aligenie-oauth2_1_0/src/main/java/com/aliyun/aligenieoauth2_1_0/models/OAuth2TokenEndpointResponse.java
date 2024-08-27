// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class OAuth2TokenEndpointResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OAuth2TokenEndpointResponseBody body;

    public static OAuth2TokenEndpointResponse build(java.util.Map<String, ?> map) throws Exception {
        OAuth2TokenEndpointResponse self = new OAuth2TokenEndpointResponse();
        return TeaModel.build(map, self);
    }

    public OAuth2TokenEndpointResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OAuth2TokenEndpointResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OAuth2TokenEndpointResponse setBody(OAuth2TokenEndpointResponseBody body) {
        this.body = body;
        return this;
    }
    public OAuth2TokenEndpointResponseBody getBody() {
        return this.body;
    }

}
