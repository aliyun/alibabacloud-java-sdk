// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class InitializeOperationRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeOperationRoleResponseBody body;

    public static InitializeOperationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeOperationRoleResponse self = new InitializeOperationRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeOperationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeOperationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeOperationRoleResponse setBody(InitializeOperationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeOperationRoleResponseBody getBody() {
        return this.body;
    }

}
