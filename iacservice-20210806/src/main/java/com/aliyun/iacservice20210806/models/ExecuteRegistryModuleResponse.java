// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class ExecuteRegistryModuleResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExecuteRegistryModuleResponseBody body;

    public static ExecuteRegistryModuleResponse build(java.util.Map<String, ?> map) throws Exception {
        ExecuteRegistryModuleResponse self = new ExecuteRegistryModuleResponse();
        return TeaModel.build(map, self);
    }

    public ExecuteRegistryModuleResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExecuteRegistryModuleResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExecuteRegistryModuleResponse setBody(ExecuteRegistryModuleResponseBody body) {
        this.body = body;
        return this;
    }
    public ExecuteRegistryModuleResponseBody getBody() {
        return this.body;
    }

}
