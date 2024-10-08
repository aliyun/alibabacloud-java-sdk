// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gemp20210413.models;

import com.aliyun.tea.*;

public class CreateProblemResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateProblemResponseBody body;

    public static CreateProblemResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateProblemResponse self = new CreateProblemResponse();
        return TeaModel.build(map, self);
    }

    public CreateProblemResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateProblemResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateProblemResponse setBody(CreateProblemResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateProblemResponseBody getBody() {
        return this.body;
    }

}
