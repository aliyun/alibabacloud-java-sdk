// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CopyCasterSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CopyCasterSceneConfigResponseBody body;

    public static CopyCasterSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        CopyCasterSceneConfigResponse self = new CopyCasterSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public CopyCasterSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CopyCasterSceneConfigResponse setBody(CopyCasterSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public CopyCasterSceneConfigResponseBody getBody() {
        return this.body;
    }

}
