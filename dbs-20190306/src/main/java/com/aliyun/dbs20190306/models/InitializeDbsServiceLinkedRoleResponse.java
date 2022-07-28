// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbs20190306.models;

import com.aliyun.tea.*;

public class InitializeDbsServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeDbsServiceLinkedRoleResponseBody body;

    public static InitializeDbsServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeDbsServiceLinkedRoleResponse self = new InitializeDbsServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeDbsServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeDbsServiceLinkedRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InitializeDbsServiceLinkedRoleResponse setBody(InitializeDbsServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeDbsServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
