// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CreateDefaultRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateDefaultRoleResponseBody body;

    public static CreateDefaultRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefaultRoleResponse self = new CreateDefaultRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefaultRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefaultRoleResponse setBody(CreateDefaultRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefaultRoleResponseBody getBody() {
        return this.body;
    }

}
