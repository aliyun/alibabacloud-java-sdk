// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20200710.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaAppResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreateMcubeNebulaAppResponseBody body;

    public static CreateMcubeNebulaAppResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaAppResponse self = new CreateMcubeNebulaAppResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaAppResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeNebulaAppResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeNebulaAppResponse setBody(CreateMcubeNebulaAppResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeNebulaAppResponseBody getBody() {
        return this.body;
    }

}
