// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.market20151101.models;

import com.aliyun.tea.*;

public class PauseProjectResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public PauseProjectResponseBody body;

    public static PauseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseProjectResponse self = new PauseProjectResponse();
        return TeaModel.build(map, self);
    }

    public PauseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseProjectResponse setBody(PauseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseProjectResponseBody getBody() {
        return this.body;
    }

}
