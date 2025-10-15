// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationFederatedCredentialsForProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListApplicationFederatedCredentialsForProviderResponseBody body;

    public static ListApplicationFederatedCredentialsForProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationFederatedCredentialsForProviderResponse self = new ListApplicationFederatedCredentialsForProviderResponse();
        return TeaModel.build(map, self);
    }

    public ListApplicationFederatedCredentialsForProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListApplicationFederatedCredentialsForProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListApplicationFederatedCredentialsForProviderResponse setBody(ListApplicationFederatedCredentialsForProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public ListApplicationFederatedCredentialsForProviderResponseBody getBody() {
        return this.body;
    }

}
