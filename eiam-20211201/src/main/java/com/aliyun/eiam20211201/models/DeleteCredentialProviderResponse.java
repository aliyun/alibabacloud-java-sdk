// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteCredentialProviderResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCredentialProviderResponseBody body;

    public static DeleteCredentialProviderResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCredentialProviderResponse self = new DeleteCredentialProviderResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCredentialProviderResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCredentialProviderResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCredentialProviderResponse setBody(DeleteCredentialProviderResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCredentialProviderResponseBody getBody() {
        return this.body;
    }

}
