// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ledgerdb20191122.models;

import com.aliyun.tea.*;

public class GrantServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GrantServiceLinkedRoleResponseBody body;

    public static GrantServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantServiceLinkedRoleResponse self = new GrantServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public GrantServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantServiceLinkedRoleResponse setBody(GrantServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
