// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class AuthorizeSkillResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AuthorizeSkillResponseBody body;

    public static AuthorizeSkillResponse build(java.util.Map<String, ?> map) throws Exception {
        AuthorizeSkillResponse self = new AuthorizeSkillResponse();
        return TeaModel.build(map, self);
    }

    public AuthorizeSkillResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AuthorizeSkillResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AuthorizeSkillResponse setBody(AuthorizeSkillResponseBody body) {
        this.body = body;
        return this;
    }
    public AuthorizeSkillResponseBody getBody() {
        return this.body;
    }

}
