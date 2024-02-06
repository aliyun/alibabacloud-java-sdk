// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20190315.models;

import com.aliyun.tea.*;

public class BindDBResourcePoolWithUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BindDBResourcePoolWithUserResponseBody body;

    public static BindDBResourcePoolWithUserResponse build(java.util.Map<String, ?> map) throws Exception {
        BindDBResourcePoolWithUserResponse self = new BindDBResourcePoolWithUserResponse();
        return TeaModel.build(map, self);
    }

    public BindDBResourcePoolWithUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BindDBResourcePoolWithUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BindDBResourcePoolWithUserResponse setBody(BindDBResourcePoolWithUserResponseBody body) {
        this.body = body;
        return this;
    }
    public BindDBResourcePoolWithUserResponseBody getBody() {
        return this.body;
    }

}
