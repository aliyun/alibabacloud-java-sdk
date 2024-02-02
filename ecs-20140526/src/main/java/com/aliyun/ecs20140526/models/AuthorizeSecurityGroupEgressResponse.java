// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupEgressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AuthorizeSecurityGroupEgressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeSecurityGroupEgressResponse setBody(AuthorizeSecurityGroupEgressResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeSecurityGroupEgressResponseBody getBody() {
        return this.body;
    }

}
