// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateIdentityProviderStatusCheckJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateIdentityProviderStatusCheckJobResponseBody body;

    public static CreateIdentityProviderStatusCheckJobResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateIdentityProviderStatusCheckJobResponse self = new CreateIdentityProviderStatusCheckJobResponse();
        return TeaModel.build(map, self);
    }

    public CreateIdentityProviderStatusCheckJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateIdentityProviderStatusCheckJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateIdentityProviderStatusCheckJobResponse setBody(CreateIdentityProviderStatusCheckJobResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateIdentityProviderStatusCheckJobResponseBody getBody() {
        return this.body;
    }

}
