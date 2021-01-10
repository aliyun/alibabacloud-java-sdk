// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopCasterSceneResponseBody body;

    public static StopCasterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StopCasterSceneResponse self = new StopCasterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StopCasterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopCasterSceneResponse setBody(StopCasterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCasterSceneResponseBody getBody() {
        return this.body;
    }

}
