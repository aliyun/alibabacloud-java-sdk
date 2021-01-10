// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DeleteCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public DeleteCasterSceneConfigResponse setBody(DeleteCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
