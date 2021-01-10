// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public UpdateCasterSceneConfigResponse setBody(UpdateCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
