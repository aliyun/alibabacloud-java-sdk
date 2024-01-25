// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class UpdateSceneModelCurVersionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSceneModelCurVersionResponseBody body;

    public static UpdateSceneModelCurVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneModelCurVersionResponse self = new UpdateSceneModelCurVersionResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneModelCurVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneModelCurVersionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneModelCurVersionResponse setBody(UpdateSceneModelCurVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneModelCurVersionResponseBody getBody() {
        return this.body;
    }

}
