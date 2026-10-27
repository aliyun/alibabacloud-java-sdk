// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class ListIdentityProviderSCIMCredentialsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListIdentityProviderSCIMCredentialsResponseBody body;

    public static ListIdentityProviderSCIMCredentialsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityProviderSCIMCredentialsResponse self = new ListIdentityProviderSCIMCredentialsResponse();
        return TeaModel.build(map, self);
    }

    public ListIdentityProviderSCIMCredentialsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListIdentityProviderSCIMCredentialsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListIdentityProviderSCIMCredentialsResponse setBody(ListIdentityProviderSCIMCredentialsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListIdentityProviderSCIMCredentialsResponseBody getBody() {
        return this.body;
    }

}
