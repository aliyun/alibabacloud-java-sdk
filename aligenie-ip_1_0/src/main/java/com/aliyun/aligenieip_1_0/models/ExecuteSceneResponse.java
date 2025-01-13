// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieip_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSceneResponseBody body;

    public static ExecuteSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSceneResponse self = new ExecuteSceneResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSceneResponse setBody(ExecuteSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSceneResponseBody getBody() {
        return this.body;
    }

}
