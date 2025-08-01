// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StopCasterSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopCasterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopCasterSceneResponse setBody(StopCasterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StopCasterSceneResponseBody getBody() {
        return this.body;
    }

}
