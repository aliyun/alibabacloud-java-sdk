// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSceneModelResponseBody body;

    public static UpdateSceneModelResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelResponse self = new UpdateSceneModelResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneModelResponse setBody(UpdateSceneModelResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneModelResponseBody getBody() {
        return this.body;
    }

}
