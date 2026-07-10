// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLangfuseProjectResponseBody body;

    public static CreateLangfuseProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseProjectResponse self = new CreateLangfuseProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLangfuseProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLangfuseProjectResponse setBody(CreateLangfuseProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLangfuseProjectResponseBody getBody() {
        return this.body;
    }

}
