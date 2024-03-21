// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateRoutineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateRoutineResponseBody body;

    public static CreateRoutineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateRoutineResponse self = new CreateRoutineResponse();
        return TeaModel.build(map, self);
    }

    public CreateRoutineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateRoutineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateRoutineResponse setBody(CreateRoutineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateRoutineResponseBody getBody() {
        return this.body;
    }

}
