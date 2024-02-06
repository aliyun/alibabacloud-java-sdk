// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeNebulaTaskResponseBody body;

    public static CreateMcubeNebulaTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaTaskResponse self = new CreateMcubeNebulaTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeNebulaTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeNebulaTaskResponse setBody(CreateMcubeNebulaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeNebulaTaskResponseBody getBody() {
        return this.body;
    }

}
