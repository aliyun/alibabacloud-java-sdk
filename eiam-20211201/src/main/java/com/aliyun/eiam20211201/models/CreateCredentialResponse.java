// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCredentialResponseBody body;

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

    public CreateCredentialResponse setBody(CreateCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCredentialResponseBody getBody() {
        return this.body;
    }

}
