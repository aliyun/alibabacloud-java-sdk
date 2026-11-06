// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class GenerateSceneKeyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GenerateSceneKeyResponseBody body;

    public static GenerateSceneKeyResponse build(java.util.Map<String, ?> map) throws Exception {
        GenerateSceneKeyResponse self = new GenerateSceneKeyResponse();
        return TeaModel.build(map, self);
    }

    public GenerateSceneKeyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GenerateSceneKeyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GenerateSceneKeyResponse setBody(GenerateSceneKeyResponseBody body) {
        this.body = body;
        return this;
    }
    public GenerateSceneKeyResponseBody getBody() {
        return this.body;
    }

}
