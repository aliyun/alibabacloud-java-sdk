// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class CreateSceneModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSceneModelResponseBody body;

    public static CreateSceneModelResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneModelResponse self = new CreateSceneModelResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSceneModelResponse setBody(CreateSceneModelResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneModelResponseBody getBody() {
        return this.body;
    }

}
