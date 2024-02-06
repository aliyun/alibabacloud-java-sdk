// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeVhostResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeVhostResponseBody body;

    public static CreateMcubeVhostResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeVhostResponse self = new CreateMcubeVhostResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeVhostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeVhostResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeVhostResponse setBody(CreateMcubeVhostResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeVhostResponseBody getBody() {
        return this.body;
    }

}
