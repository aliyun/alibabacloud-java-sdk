// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class JoinProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public JoinProjectResponseBody body;

    public static JoinProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        JoinProjectResponse self = new JoinProjectResponse();
        return TeaModel.build(map, self);
    }

    public JoinProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public JoinProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public JoinProjectResponse setBody(JoinProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public JoinProjectResponseBody getBody() {
        return this.body;
    }

}
