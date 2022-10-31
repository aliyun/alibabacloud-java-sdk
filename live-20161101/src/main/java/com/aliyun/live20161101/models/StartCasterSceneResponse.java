// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class StartCasterSceneResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StartCasterSceneResponseBody body;

    public static StartCasterSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        StartCasterSceneResponse self = new StartCasterSceneResponse();
        return TeaModel.build(map, self);
    }

    public StartCasterSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartCasterSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartCasterSceneResponse setBody(StartCasterSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public StartCasterSceneResponseBody getBody() {
        return this.body;
    }

}
