// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.btripopen20220520.models;

import com.aliyun.tea.*;

public class CreateCustomRoleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCustomRoleResponseBody body;

    public static CreateCustomRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomRoleResponse self = new CreateCustomRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateCustomRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCustomRoleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCustomRoleResponse setBody(CreateCustomRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCustomRoleResponseBody getBody() {
        return this.body;
    }

}
