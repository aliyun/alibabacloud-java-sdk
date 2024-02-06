// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiUpdateActiveSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiUpdateActiveSceneResponseBody body;

    public static OpenApiUpdateActiveSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiUpdateActiveSceneResponse self = new OpenApiUpdateActiveSceneResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiUpdateActiveSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiUpdateActiveSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiUpdateActiveSceneResponse setBody(OpenApiUpdateActiveSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiUpdateActiveSceneResponseBody getBody() {
        return this.body;
    }

}
