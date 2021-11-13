// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdp20210402.models;

import com.aliyun.tea.*;

public class HasDefaultRoleResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public HasDefaultRoleResponseBody body;

    public static HasDefaultRoleResponse build(java.util.Map<String, ?> map) throws Exception {
        HasDefaultRoleResponse self = new HasDefaultRoleResponse();
        return TeaModel.build(map, self);
    }

    public HasDefaultRoleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public HasDefaultRoleResponse setBody(HasDefaultRoleResponseBody body) {
        this.body = body;
        return this;
    }
    public HasDefaultRoleResponseBody getBody() {
        return this.body;
    }

}
