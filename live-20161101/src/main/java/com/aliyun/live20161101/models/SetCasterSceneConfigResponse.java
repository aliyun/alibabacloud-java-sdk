// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class SetCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetCasterSceneConfigResponse setBody(SetCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
