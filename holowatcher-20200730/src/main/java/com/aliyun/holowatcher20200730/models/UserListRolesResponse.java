// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserListRolesResponseBody body;

    public static UserListRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        UserListRolesResponse self = new UserListRolesResponse();
        return TeaModel.build(map, self);
    }

    public UserListRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserListRolesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserListRolesResponse setBody(UserListRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public UserListRolesResponseBody getBody() {
        return this.body;
    }

}
