// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateSCIMServerCredentialResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSCIMServerCredentialResponseBody body;

    public static CreateSCIMServerCredentialResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSCIMServerCredentialResponse self = new CreateSCIMServerCredentialResponse();
        return TeaModel.build(map, self);
    }

    public CreateSCIMServerCredentialResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSCIMServerCredentialResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSCIMServerCredentialResponse setBody(CreateSCIMServerCredentialResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSCIMServerCredentialResponseBody getBody() {
        return this.body;
    }

}
