// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class UnbindUserResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UnbindUserResponseBody body;

    public static UnbindUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindUserResponse self = new UnbindUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindUserResponse setBody(UnbindUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindUserResponseBody getBody() {
        return this.body;
    }

}
