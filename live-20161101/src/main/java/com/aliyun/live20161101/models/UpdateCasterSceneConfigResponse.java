// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateCasterSceneConfigResponseBody body;

    public static UpdateCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneConfigResponse self = new UpdateCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateCasterSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateCasterSceneConfigResponse setBody(UpdateCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
