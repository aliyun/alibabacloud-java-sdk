// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class CreateOrUpdateRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CreateOrUpdateRoleResponseBody body;

    public static CreateOrUpdateRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOrUpdateRoleResponse self = new CreateOrUpdateRoleResponse();
        return TeaModel.build(map, self);
    }

    public CreateOrUpdateRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOrUpdateRoleResponse setBody(CreateOrUpdateRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOrUpdateRoleResponseBody getBody() {
        return this.body;
    }

}
