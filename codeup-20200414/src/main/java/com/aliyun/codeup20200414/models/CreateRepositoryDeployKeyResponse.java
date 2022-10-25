// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class CreateRepositoryDeployKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateRepositoryDeployKeyResponseBody body;

    public static CreateRepositoryDeployKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRepositoryDeployKeyResponse self = new CreateRepositoryDeployKeyResponse();
        return TeaModel.build(map, self);
    }

    public CreateRepositoryDeployKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRepositoryDeployKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRepositoryDeployKeyResponse setBody(CreateRepositoryDeployKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRepositoryDeployKeyResponseBody getBody() {
        return this.body;
    }

}
