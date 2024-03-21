// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateSlrAndSlsProjectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSlrAndSlsProjectResponseBody body;

    public static CreateSlrAndSlsProjectResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSlrAndSlsProjectResponse self = new CreateSlrAndSlsProjectResponse();
        return TeaModel.build(map, self);
    }

    public CreateSlrAndSlsProjectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSlrAndSlsProjectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSlrAndSlsProjectResponse setBody(CreateSlrAndSlsProjectResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSlrAndSlsProjectResponseBody getBody() {
        return this.body;
    }

}
