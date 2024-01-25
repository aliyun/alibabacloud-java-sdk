// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adp20210720.models;

import com.aliyun.tea.*;

public class DeleteEnvironmentNodeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteEnvironmentNodeResponseBody body;

    public static DeleteEnvironmentNodeResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteEnvironmentNodeResponse self = new DeleteEnvironmentNodeResponse();
        return TeaModel.build(map, self);
    }

    public DeleteEnvironmentNodeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteEnvironmentNodeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteEnvironmentNodeResponse setBody(DeleteEnvironmentNodeResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteEnvironmentNodeResponseBody getBody() {
        return this.body;
    }

}
