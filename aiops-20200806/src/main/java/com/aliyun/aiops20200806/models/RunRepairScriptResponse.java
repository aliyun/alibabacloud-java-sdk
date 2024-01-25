// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiops20200806.models;

import com.aliyun.tea.*;

public class RunRepairScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunRepairScriptResponseBody body;

    public static RunRepairScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        RunRepairScriptResponse self = new RunRepairScriptResponse();
        return TeaModel.build(map, self);
    }

    public RunRepairScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunRepairScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunRepairScriptResponse setBody(RunRepairScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public RunRepairScriptResponseBody getBody() {
        return this.body;
    }

}
