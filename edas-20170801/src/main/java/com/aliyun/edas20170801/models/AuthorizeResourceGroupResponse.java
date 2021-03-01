// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class AuthorizeResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeResourceGroupResponseBody body;

    public static AuthorizeResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceGroupResponse self = new AuthorizeResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceGroupResponse setBody(AuthorizeResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceGroupResponseBody getBody() {
        return this.body;
    }

}
