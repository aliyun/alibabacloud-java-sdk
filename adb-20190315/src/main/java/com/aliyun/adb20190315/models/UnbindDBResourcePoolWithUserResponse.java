// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class UnbindDBResourcePoolWithUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UnbindDBResourcePoolWithUserResponseBody body;

    public static UnbindDBResourcePoolWithUserResponse build(java.util.Map<String, ?> map) throws Exception {
        UnbindDBResourcePoolWithUserResponse self = new UnbindDBResourcePoolWithUserResponse();
        return TeaModel.build(map, self);
    }

    public UnbindDBResourcePoolWithUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UnbindDBResourcePoolWithUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UnbindDBResourcePoolWithUserResponse setBody(UnbindDBResourcePoolWithUserResponseBody body) {
        this.body = body;
        return this;
    }
    public UnbindDBResourcePoolWithUserResponseBody getBody() {
        return this.body;
    }

}
