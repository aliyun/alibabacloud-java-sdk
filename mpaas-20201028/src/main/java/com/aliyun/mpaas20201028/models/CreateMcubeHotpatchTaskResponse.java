// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeHotpatchTaskResponseBody body;

    public static CreateMcubeHotpatchTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchTaskResponse self = new CreateMcubeHotpatchTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeHotpatchTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeHotpatchTaskResponse setBody(CreateMcubeHotpatchTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeHotpatchTaskResponseBody getBody() {
        return this.body;
    }

}
