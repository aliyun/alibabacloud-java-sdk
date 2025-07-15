// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteCasterSceneConfigResponseBody body;

    public static DeleteCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteCasterSceneConfigResponse self = new DeleteCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public DeleteCasterSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteCasterSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteCasterSceneConfigResponse setBody(DeleteCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
