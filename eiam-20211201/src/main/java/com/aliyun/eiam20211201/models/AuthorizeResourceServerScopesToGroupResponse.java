// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class AuthorizeResourceServerScopesToGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeResourceServerScopesToGroupResponseBody body;

    public static AuthorizeResourceServerScopesToGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeResourceServerScopesToGroupResponse self = new AuthorizeResourceServerScopesToGroupResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeResourceServerScopesToGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeResourceServerScopesToGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeResourceServerScopesToGroupResponse setBody(AuthorizeResourceServerScopesToGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeResourceServerScopesToGroupResponseBody getBody() {
        return this.body;
    }

}
