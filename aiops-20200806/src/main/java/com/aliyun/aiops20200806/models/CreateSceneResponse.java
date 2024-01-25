// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSceneResponseBody body;

    public static CreateSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneResponse self = new CreateSceneResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSceneResponse setBody(CreateSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneResponseBody getBody() {
        return this.body;
    }

}
