// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SubmitProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SubmitProjectResponseBody body;

    public static SubmitProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        SubmitProjectResponse self = new SubmitProjectResponse();
        return TeaModel.build(map, self);
    }

    public SubmitProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SubmitProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SubmitProjectResponse setBody(SubmitProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public SubmitProjectResponseBody getBody() {
        return this.body;
    }

}
