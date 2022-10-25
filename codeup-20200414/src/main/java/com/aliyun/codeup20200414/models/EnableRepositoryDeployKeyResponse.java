// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.codeup20200414.models;

import com.aliyun.tea.*;

public class EnableRepositoryDeployKeyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public EnableRepositoryDeployKeyResponseBody body;

    public static EnableRepositoryDeployKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableRepositoryDeployKeyResponse self = new EnableRepositoryDeployKeyResponse();
        return TeaModel.build(map, self);
    }

    public EnableRepositoryDeployKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableRepositoryDeployKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableRepositoryDeployKeyResponse setBody(EnableRepositoryDeployKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableRepositoryDeployKeyResponseBody getBody() {
        return this.body;
    }

}
