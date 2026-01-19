// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class CreateApplicationRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateApplicationRoleResponseBody body;

    public static CreateApplicationRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateApplicationRoleResponse self = new CreateApplicationRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateApplicationRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateApplicationRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateApplicationRoleResponse setBody(CreateApplicationRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateApplicationRoleResponseBody getBody() {
        return this.body;
    }

}
