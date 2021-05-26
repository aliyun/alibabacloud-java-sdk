// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cccxspaceinner20191227.models;

import com.aliyun.tea.*;

public class GrantAdminRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantAdminRoleResponseBody body;

    public static GrantAdminRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantAdminRoleResponse self = new GrantAdminRoleResponse();
        return TeaModel.build(map, self);
    }

    public GrantAdminRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantAdminRoleResponse setBody(GrantAdminRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantAdminRoleResponseBody getBody() {
        return this.body;
    }

}
