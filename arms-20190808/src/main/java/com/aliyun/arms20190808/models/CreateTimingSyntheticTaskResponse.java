// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateTimingSyntheticTaskResponseBody body;

    public static CreateTimingSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTimingSyntheticTaskResponse self = new CreateTimingSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateTimingSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTimingSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTimingSyntheticTaskResponse setBody(CreateTimingSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTimingSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
