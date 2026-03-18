// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class GetCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCredentialProviderResponseBody body;

    public static GetCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCredentialProviderResponse self = new GetCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public GetCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCredentialProviderResponse setBody(GetCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
