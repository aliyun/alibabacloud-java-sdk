// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class UpdateCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCredentialProviderResponseBody body;

    public static UpdateCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCredentialProviderResponse self = new UpdateCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCredentialProviderResponse setBody(UpdateCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
