// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListPermissionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UserListPermissionsResponseBody body;

    public static UserListPermissionsResponse build(java.util.Map<String, ?> map) throws Exception {
        UserListPermissionsResponse self = new UserListPermissionsResponse();
        return TeaModel.build(map, self);
    }

    public UserListPermissionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserListPermissionsResponse setBody(UserListPermissionsResponseBody body) {
        this.body = body;
        return this;
    }
    public UserListPermissionsResponseBody getBody() {
        return this.body;
    }

}
