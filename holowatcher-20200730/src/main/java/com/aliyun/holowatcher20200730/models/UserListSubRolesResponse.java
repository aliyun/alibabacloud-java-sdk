// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListSubRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserListSubRolesResponseBody body;

    public static UserListSubRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        UserListSubRolesResponse self = new UserListSubRolesResponse();
        return TeaModel.build(map, self);
    }

    public UserListSubRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserListSubRolesResponse setBody(UserListSubRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public UserListSubRolesResponseBody getBody() {
        return this.body;
    }

}
