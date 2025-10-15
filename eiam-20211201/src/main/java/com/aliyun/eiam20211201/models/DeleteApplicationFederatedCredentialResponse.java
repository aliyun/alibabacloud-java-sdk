// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class DeleteApplicationFederatedCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteApplicationFederatedCredentialResponseBody body;

    public static DeleteApplicationFederatedCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApplicationFederatedCredentialResponse self = new DeleteApplicationFederatedCredentialResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApplicationFederatedCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApplicationFederatedCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteApplicationFederatedCredentialResponse setBody(DeleteApplicationFederatedCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApplicationFederatedCredentialResponseBody getBody() {
        return this.body;
    }

}
