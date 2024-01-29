// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateDeployKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDeployKeyResponseBody body;

    public static CreateDeployKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDeployKeyResponse self = new CreateDeployKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateDeployKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDeployKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDeployKeyResponse setBody(CreateDeployKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDeployKeyResponseBody getBody() {
        return this.body;
    }

}
