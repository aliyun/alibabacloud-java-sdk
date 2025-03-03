// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo_controller20221215.models;

import com.aliyun.tea.*;

public class CreateNetTestTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateNetTestTaskResponseBody body;

    public static CreateNetTestTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateNetTestTaskResponse self = new CreateNetTestTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateNetTestTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateNetTestTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateNetTestTaskResponse setBody(CreateNetTestTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateNetTestTaskResponseBody getBody() {
        return this.body;
    }

}
