// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20230522.models;

import com.aliyun.tea.*;

public class CreateLangfuseUserResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateLangfuseUserResponseBody body;

    public static CreateLangfuseUserResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateLangfuseUserResponse self = new CreateLangfuseUserResponse();
        return TeaModel.build(map, self);
    }

    public CreateLangfuseUserResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateLangfuseUserResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateLangfuseUserResponse setBody(CreateLangfuseUserResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateLangfuseUserResponseBody getBody() {
        return this.body;
    }

}
