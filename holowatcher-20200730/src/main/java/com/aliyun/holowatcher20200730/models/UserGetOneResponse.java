// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class UserGetOneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UserGetOneResponseBody body;

    public static UserGetOneResponse build(java.util.Map<String, ?> map) throws Exception {
        UserGetOneResponse self = new UserGetOneResponse();
        return TeaModel.build(map, self);
    }

    public UserGetOneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UserGetOneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UserGetOneResponse setBody(UserGetOneResponseBody body) {
        this.body = body;
        return this;
    }
    public UserGetOneResponseBody getBody() {
        return this.body;
    }

}
