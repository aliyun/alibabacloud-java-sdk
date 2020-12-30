// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20160408.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeSecurityGroupResponseBody body;

    public static AuthorizeSecurityGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupResponse self = new AuthorizeSecurityGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeSecurityGroupResponse setBody(AuthorizeSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
