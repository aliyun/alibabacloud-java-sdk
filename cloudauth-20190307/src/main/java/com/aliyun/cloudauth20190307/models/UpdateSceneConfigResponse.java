// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class UpdateSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateSceneConfigResponseBody body;

    public static UpdateSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateSceneConfigResponse self = new UpdateSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateSceneConfigResponse setBody(UpdateSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateSceneConfigResponseBody getBody() {
        return this.body;
    }

}
