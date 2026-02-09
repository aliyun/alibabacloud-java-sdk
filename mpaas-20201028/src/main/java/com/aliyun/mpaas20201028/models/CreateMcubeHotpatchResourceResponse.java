// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class CreateMcubeHotpatchResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMcubeHotpatchResourceResponseBody body;

    public static CreateMcubeHotpatchResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMcubeHotpatchResourceResponse self = new CreateMcubeHotpatchResourceResponse();
        return TeaModel.build(map, self);
    }

    public CreateMcubeHotpatchResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMcubeHotpatchResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMcubeHotpatchResourceResponse setBody(CreateMcubeHotpatchResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMcubeHotpatchResourceResponseBody getBody() {
        return this.body;
    }

}
