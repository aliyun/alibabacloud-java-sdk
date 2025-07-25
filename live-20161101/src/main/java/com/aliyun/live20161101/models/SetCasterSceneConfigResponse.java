// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetCasterSceneConfigResponseBody body;

    public static SetCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetCasterSceneConfigResponse self = new SetCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetCasterSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetCasterSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetCasterSceneConfigResponse setBody(SetCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
