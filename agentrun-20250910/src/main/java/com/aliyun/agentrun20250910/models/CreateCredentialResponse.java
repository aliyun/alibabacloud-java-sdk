// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class CreateCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CredentialResult body;

    public static CreateCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCredentialResponse self = new CreateCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCredentialResponse setBody(CredentialResult body) {
        this.body = body;
        return this;
    }
    public CredentialResult getBody() {
        return this.body;
    }

}
