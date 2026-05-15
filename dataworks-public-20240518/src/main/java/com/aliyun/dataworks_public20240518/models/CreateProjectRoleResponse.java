// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateProjectRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProjectRoleResponseBody body;

    public static CreateProjectRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProjectRoleResponse self = new CreateProjectRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateProjectRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProjectRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProjectRoleResponse setBody(CreateProjectRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProjectRoleResponseBody getBody() {
        return this.body;
    }

}
