// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AuthorizeSecurityGroupEgressResponseBody body;

    public static AuthorizeSecurityGroupEgressResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSecurityGroupEgressResponse self = new AuthorizeSecurityGroupEgressResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeSecurityGroupEgressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeSecurityGroupEgressResponse setBody(AuthorizeSecurityGroupEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeSecurityGroupEgressResponseBody getBody() {
        return this.body;
    }

}
