// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public CreateMcubeNebulaTaskResponse setBody(CreateMcubeNebulaTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeNebulaTaskResponseBody getBody() {
        return this.body;
    }

}
