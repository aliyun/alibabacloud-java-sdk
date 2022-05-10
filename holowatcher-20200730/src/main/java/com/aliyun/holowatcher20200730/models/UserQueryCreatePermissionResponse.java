// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserQueryCreatePermissionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserQueryCreatePermissionResponseBody body;

    public static UserQueryCreatePermissionResponse build(java.util.Map<String, ?> map) throws Exception {
        UserQueryCreatePermissionResponse self = new UserQueryCreatePermissionResponse();
        return TeaModel.build(map, self);
    }

    public UserQueryCreatePermissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserQueryCreatePermissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserQueryCreatePermissionResponse setBody(UserQueryCreatePermissionResponseBody body) {
        this.body = body;
        return this;
    }
    public UserQueryCreatePermissionResponseBody getBody() {
        return this.body;
    }

}
