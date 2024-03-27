// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ExecuteScriptResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteScriptResponseBody body;

    public static ExecuteScriptResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteScriptResponse self = new ExecuteScriptResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteScriptResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteScriptResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteScriptResponse setBody(ExecuteScriptResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteScriptResponseBody getBody() {
        return this.body;
    }

}
