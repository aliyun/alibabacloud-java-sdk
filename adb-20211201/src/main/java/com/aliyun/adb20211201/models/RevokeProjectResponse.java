// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class RevokeProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RevokeProjectResponseBody body;

    public static RevokeProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        RevokeProjectResponse self = new RevokeProjectResponse();
        return TeaModel.build(map, self);
    }

    public RevokeProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RevokeProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RevokeProjectResponse setBody(RevokeProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public RevokeProjectResponseBody getBody() {
        return this.body;
    }

}
