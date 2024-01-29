// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateServiceCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateServiceCredentialResponseBody body;

    public static CreateServiceCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceCredentialResponse self = new CreateServiceCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateServiceCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateServiceCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateServiceCredentialResponse setBody(CreateServiceCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateServiceCredentialResponseBody getBody() {
        return this.body;
    }

}
