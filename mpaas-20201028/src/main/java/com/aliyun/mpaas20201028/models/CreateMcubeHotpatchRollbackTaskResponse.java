// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchRollbackTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeHotpatchRollbackTaskResponseBody body;

    public static CreateMcubeHotpatchRollbackTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchRollbackTaskResponse self = new CreateMcubeHotpatchRollbackTaskResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchRollbackTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeHotpatchRollbackTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeHotpatchRollbackTaskResponse setBody(CreateMcubeHotpatchRollbackTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeHotpatchRollbackTaskResponseBody getBody() {
        return this.body;
    }

}
