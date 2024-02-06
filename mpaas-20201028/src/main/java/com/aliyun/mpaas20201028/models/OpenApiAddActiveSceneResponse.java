// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiAddActiveSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiAddActiveSceneResponseBody body;

    public static OpenApiAddActiveSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiAddActiveSceneResponse self = new OpenApiAddActiveSceneResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiAddActiveSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiAddActiveSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiAddActiveSceneResponse setBody(OpenApiAddActiveSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiAddActiveSceneResponseBody getBody() {
        return this.body;
    }

}
