// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetApplicationFederatedCredentialResponseBody body;

    public static GetApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        GetApplicationFederatedCredentialResponse self = new GetApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public GetApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetApplicationFederatedCredentialResponse setBody(GetApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public GetApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
