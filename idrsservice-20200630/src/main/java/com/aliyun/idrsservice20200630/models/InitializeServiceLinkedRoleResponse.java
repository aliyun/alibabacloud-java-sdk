// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630.models;

import com.aliyun.tea.*;

public class InitializeServiceLinkedRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public InitializeServiceLinkedRoleResponseBody body;

    public static InitializeServiceLinkedRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        InitializeServiceLinkedRoleResponse self = new InitializeServiceLinkedRoleResponse();
        return TeaModel.build(map, self);
    }

    public InitializeServiceLinkedRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InitializeServiceLinkedRoleResponse setBody(InitializeServiceLinkedRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public InitializeServiceLinkedRoleResponseBody getBody() {
        return this.body;
    }

}
