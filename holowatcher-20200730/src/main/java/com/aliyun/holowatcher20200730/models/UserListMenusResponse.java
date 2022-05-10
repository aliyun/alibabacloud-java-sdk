// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserListMenusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserListMenusResponseBody body;

    public static UserListMenusResponse build(java.util.Map<String, ?> map) throws Exception {
        UserListMenusResponse self = new UserListMenusResponse();
        return TeaModel.build(map, self);
    }

    public UserListMenusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserListMenusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserListMenusResponse setBody(UserListMenusResponseBody body) {
        this.body = body;
        return this;
    }
    public UserListMenusResponseBody getBody() {
        return this.body;
    }

}
