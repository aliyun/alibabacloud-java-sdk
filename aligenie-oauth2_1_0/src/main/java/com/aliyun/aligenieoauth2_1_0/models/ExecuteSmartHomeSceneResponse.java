// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aligenieoauth2_1_0.models;

import com.aliyun.tea.*;

public class ExecuteSmartHomeSceneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteSmartHomeSceneResponseBody body;

    public static ExecuteSmartHomeSceneResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteSmartHomeSceneResponse self = new ExecuteSmartHomeSceneResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteSmartHomeSceneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteSmartHomeSceneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteSmartHomeSceneResponse setBody(ExecuteSmartHomeSceneResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteSmartHomeSceneResponseBody getBody() {
        return this.body;
    }

}
