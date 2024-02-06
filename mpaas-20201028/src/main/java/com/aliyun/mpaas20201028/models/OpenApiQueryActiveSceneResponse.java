// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpaas20201028.models;

import com.aliyun.tea.*;

public class OpenApiQueryActiveSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public OpenApiQueryActiveSceneResponseBody body;

    public static OpenApiQueryActiveSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        OpenApiQueryActiveSceneResponse self = new OpenApiQueryActiveSceneResponse();
        return TeaModel.build(map, self);
    }

    public OpenApiQueryActiveSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OpenApiQueryActiveSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public OpenApiQueryActiveSceneResponse setBody(OpenApiQueryActiveSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public OpenApiQueryActiveSceneResponseBody getBody() {
        return this.body;
    }

}
