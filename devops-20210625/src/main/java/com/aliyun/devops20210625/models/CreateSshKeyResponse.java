// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateSshKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSshKeyResponseBody body;

    public static CreateSshKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSshKeyResponse self = new CreateSshKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateSshKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSshKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSshKeyResponse setBody(CreateSshKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSshKeyResponseBody getBody() {
        return this.body;
    }

}
