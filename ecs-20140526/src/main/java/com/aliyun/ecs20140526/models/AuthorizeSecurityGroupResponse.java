// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class AuthorizeSecurityGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public AuthorizeSecurityGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeSecurityGroupResponse setBody(AuthorizeSecurityGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeSecurityGroupResponseBody getBody() {
        return this.body;
    }

}
