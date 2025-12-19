// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentidentity20250901.models;

import com.aliyun.tea.*;

public class ListOAuth2CredentialProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListOAuth2CredentialProvidersResponseBody body;

    public static ListOAuth2CredentialProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListOAuth2CredentialProvidersResponse self = new ListOAuth2CredentialProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListOAuth2CredentialProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListOAuth2CredentialProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListOAuth2CredentialProvidersResponse setBody(ListOAuth2CredentialProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListOAuth2CredentialProvidersResponseBody getBody() {
        return this.body;
    }

}
