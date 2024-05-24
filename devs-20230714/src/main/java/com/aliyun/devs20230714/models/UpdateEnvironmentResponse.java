// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devs20230714.models;

import com.aliyun.tea.*;

public class UpdateEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public Environment body;

    public static UpdateEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateEnvironmentResponse self = new UpdateEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public UpdateEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateEnvironmentResponse setBody(Environment body) {
        this.body = body;
        return this;
    }
    public Environment getBody() {
        return this.body;
    }

}
