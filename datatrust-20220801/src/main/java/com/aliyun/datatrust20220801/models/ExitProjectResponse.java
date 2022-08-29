// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ExitProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ExitProjectResponseBody body;

    public static ExitProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        ExitProjectResponse self = new ExitProjectResponse();
        return TeaModel.build(map, self);
    }

    public ExitProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExitProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExitProjectResponse setBody(ExitProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public ExitProjectResponseBody getBody() {
        return this.body;
    }

}
