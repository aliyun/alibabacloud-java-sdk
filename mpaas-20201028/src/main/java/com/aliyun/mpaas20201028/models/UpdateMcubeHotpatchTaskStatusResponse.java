// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class UpdateMcubeHotpatchTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateMcubeHotpatchTaskStatusResponseBody body;

    public static UpdateMcubeHotpatchTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateMcubeHotpatchTaskStatusResponse self = new UpdateMcubeHotpatchTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public UpdateMcubeHotpatchTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateMcubeHotpatchTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateMcubeHotpatchTaskStatusResponse setBody(UpdateMcubeHotpatchTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateMcubeHotpatchTaskStatusResponseBody getBody() {
        return this.body;
    }

}
