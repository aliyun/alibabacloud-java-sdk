// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class DeleteSceneModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSceneModelResponseBody body;

    public static DeleteSceneModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSceneModelResponse self = new DeleteSceneModelResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSceneModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSceneModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSceneModelResponse setBody(DeleteSceneModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSceneModelResponseBody getBody() {
        return this.body;
    }

}
