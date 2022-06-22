// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class UserScopeResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserScopeResponseBody body;

    public static UserScopeResponse build(java.util.Map<String, ?> map) throws Exception {
        UserScopeResponse self = new UserScopeResponse();
        return TeaModel.build(map, self);
    }

    public UserScopeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserScopeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserScopeResponse setBody(UserScopeResponseBody body) {
        this.body = body;
        return this;
    }
    public UserScopeResponseBody getBody() {
        return this.body;
    }

}
