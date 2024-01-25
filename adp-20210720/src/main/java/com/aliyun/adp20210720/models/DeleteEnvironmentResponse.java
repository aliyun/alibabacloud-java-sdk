// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvironmentResponseBody body;

    public static DeleteEnvironmentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentResponse self = new DeleteEnvironmentResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvironmentResponse setBody(DeleteEnvironmentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentResponseBody getBody() {
        return this.body;
    }

}
