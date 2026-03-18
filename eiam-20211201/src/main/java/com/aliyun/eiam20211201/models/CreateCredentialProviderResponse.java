// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCredentialProviderResponseBody body;

    public static CreateCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialProviderResponse self = new CreateCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public CreateCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCredentialProviderResponse setBody(CreateCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
