// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class ChangeMcubeNebulaTaskStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeMcubeNebulaTaskStatusResponseBody body;

    public static ChangeMcubeNebulaTaskStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeMcubeNebulaTaskStatusResponse self = new ChangeMcubeNebulaTaskStatusResponse();
        return TeaModel.build(map, self);
    }

    public ChangeMcubeNebulaTaskStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeMcubeNebulaTaskStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeMcubeNebulaTaskStatusResponse setBody(ChangeMcubeNebulaTaskStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeMcubeNebulaTaskStatusResponseBody getBody() {
        return this.body;
    }

}
