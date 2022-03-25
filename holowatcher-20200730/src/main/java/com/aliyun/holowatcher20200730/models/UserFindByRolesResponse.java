// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserFindByRolesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserFindByRolesResponseBody body;

    public static UserFindByRolesResponse build(java.util.Map<String, ?> map) throws Exception {
        UserFindByRolesResponse self = new UserFindByRolesResponse();
        return TeaModel.build(map, self);
    }

    public UserFindByRolesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserFindByRolesResponse setBody(UserFindByRolesResponseBody body) {
        this.body = body;
        return this;
    }
    public UserFindByRolesResponseBody getBody() {
        return this.body;
    }

}
