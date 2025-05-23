// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dbfs20200418.models;

import com.aliyun.tea.*;

public class CreateDbfsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDbfsResponseBody body;

    public static CreateDbfsResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDbfsResponse self = new CreateDbfsResponse();
        return TeaModel.build(map, self);
    }

    public CreateDbfsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDbfsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDbfsResponse setBody(CreateDbfsResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDbfsResponseBody getBody() {
        return this.body;
    }

}
