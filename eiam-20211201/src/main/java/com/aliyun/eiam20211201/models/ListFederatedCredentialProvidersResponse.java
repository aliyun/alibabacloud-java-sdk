// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListFederatedCredentialProvidersResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListFederatedCredentialProvidersResponseBody body;

    public static ListFederatedCredentialProvidersResponse build(java.util.Map<String, ?> map) throws Exception {
        ListFederatedCredentialProvidersResponse self = new ListFederatedCredentialProvidersResponse();
        return TeaModel.build(map, self);
    }

    public ListFederatedCredentialProvidersResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListFederatedCredentialProvidersResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListFederatedCredentialProvidersResponse setBody(ListFederatedCredentialProvidersResponseBody body) {
        this.body = body;
        return this;
    }
    public ListFederatedCredentialProvidersResponseBody getBody() {
        return this.body;
    }

}
