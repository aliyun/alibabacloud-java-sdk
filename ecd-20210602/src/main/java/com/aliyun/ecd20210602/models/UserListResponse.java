// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20210602.models;

import com.aliyun.tea.*;

public class UserListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserListResponseBody body;

    public static UserListResponse build(java.util.Map<String, ?> map) throws Exception {
        UserListResponse self = new UserListResponse();
        return TeaModel.build(map, self);
    }

    public UserListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserListResponse setBody(UserListResponseBody body) {
        this.body = body;
        return this;
    }
    public UserListResponseBody getBody() {
        return this.body;
    }

}
