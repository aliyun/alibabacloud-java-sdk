// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetIdentityProviderStatusCheckJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetIdentityProviderStatusCheckJobResponseBody body;

    public static GetIdentityProviderStatusCheckJobResponse build(java.util.Map<String, ?> map) throws Exception {
        GetIdentityProviderStatusCheckJobResponse self = new GetIdentityProviderStatusCheckJobResponse();
        return TeaModel.build(map, self);
    }

    public GetIdentityProviderStatusCheckJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetIdentityProviderStatusCheckJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetIdentityProviderStatusCheckJobResponse setBody(GetIdentityProviderStatusCheckJobResponseBody body) {
        this.body = body;
        return this;
    }
    public GetIdentityProviderStatusCheckJobResponseBody getBody() {
        return this.body;
    }

}
