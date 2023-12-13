// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eci20180808.models;

import com.aliyun.tea.*;

public class CreateInstanceOpsTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateInstanceOpsTaskResponseBody body;

    public static CreateInstanceOpsTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceOpsTaskResponse self = new CreateInstanceOpsTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateInstanceOpsTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateInstanceOpsTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateInstanceOpsTaskResponse setBody(CreateInstanceOpsTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateInstanceOpsTaskResponseBody getBody() {
        return this.body;
    }

}
