// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateSyntheticTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSyntheticTaskResponseBody body;

    public static CreateSyntheticTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSyntheticTaskResponse self = new CreateSyntheticTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateSyntheticTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSyntheticTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSyntheticTaskResponse setBody(CreateSyntheticTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSyntheticTaskResponseBody getBody() {
        return this.body;
    }

}
