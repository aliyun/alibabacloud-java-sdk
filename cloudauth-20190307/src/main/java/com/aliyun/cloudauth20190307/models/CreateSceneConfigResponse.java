// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CreateSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateSceneConfigResponseBody body;

    public static CreateSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSceneConfigResponse self = new CreateSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public CreateSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateSceneConfigResponse setBody(CreateSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateSceneConfigResponseBody getBody() {
        return this.body;
    }

}
