// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class GrantProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GrantProjectResponseBody body;

    public static GrantProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        GrantProjectResponse self = new GrantProjectResponse();
        return TeaModel.build(map, self);
    }

    public GrantProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GrantProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GrantProjectResponse setBody(GrantProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public GrantProjectResponseBody getBody() {
        return this.body;
    }

}
