// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class DisableFunctionInvocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableFunctionInvocationResponseBody body;

    public static DisableFunctionInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableFunctionInvocationResponse self = new DisableFunctionInvocationResponse();
        return TeaModel.build(map, self);
    }

    public DisableFunctionInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableFunctionInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableFunctionInvocationResponse setBody(DisableFunctionInvocationResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableFunctionInvocationResponseBody getBody() {
        return this.body;
    }

}
