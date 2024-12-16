// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class EnableIdentityProviderUdPullResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableIdentityProviderUdPullResponseBody body;

    public static EnableIdentityProviderUdPullResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableIdentityProviderUdPullResponse self = new EnableIdentityProviderUdPullResponse();
        return TeaModel.build(map, self);
    }

    public EnableIdentityProviderUdPullResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableIdentityProviderUdPullResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableIdentityProviderUdPullResponse setBody(EnableIdentityProviderUdPullResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableIdentityProviderUdPullResponseBody getBody() {
        return this.body;
    }

}
