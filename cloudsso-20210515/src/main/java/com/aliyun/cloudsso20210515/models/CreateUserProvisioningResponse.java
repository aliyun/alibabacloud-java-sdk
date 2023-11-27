// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class CreateUserProvisioningResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateUserProvisioningResponseBody body;

    public static CreateUserProvisioningResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateUserProvisioningResponse self = new CreateUserProvisioningResponse();
        return TeaModel.build(map, self);
    }

    public CreateUserProvisioningResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateUserProvisioningResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateUserProvisioningResponse setBody(CreateUserProvisioningResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateUserProvisioningResponseBody getBody() {
        return this.body;
    }

}
