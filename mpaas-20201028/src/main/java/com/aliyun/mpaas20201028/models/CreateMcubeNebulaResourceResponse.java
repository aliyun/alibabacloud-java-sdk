// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeNebulaResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeNebulaResourceResponseBody body;

    public static CreateMcubeNebulaResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeNebulaResourceResponse self = new CreateMcubeNebulaResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeNebulaResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeNebulaResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeNebulaResourceResponse setBody(CreateMcubeNebulaResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeNebulaResourceResponseBody getBody() {
        return this.body;
    }

}
