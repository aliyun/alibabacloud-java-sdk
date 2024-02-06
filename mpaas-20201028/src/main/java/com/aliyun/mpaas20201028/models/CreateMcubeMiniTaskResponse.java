// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeMiniTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeMiniTaskResponseBody body;

    public static CreateMcubeMiniTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeMiniTaskResponse self = new CreateMcubeMiniTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeMiniTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeMiniTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeMiniTaskResponse setBody(CreateMcubeMiniTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeMiniTaskResponseBody getBody() {
        return this.body;
    }

}
