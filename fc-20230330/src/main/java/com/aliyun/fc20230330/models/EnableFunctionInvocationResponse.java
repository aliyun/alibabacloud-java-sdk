// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc20230330.models;

import com.aliyun.tea.*;

public class EnableFunctionInvocationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableFunctionInvocationResponseBody body;

    public static EnableFunctionInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableFunctionInvocationResponse self = new EnableFunctionInvocationResponse();
        return TeaModel.build(map, self);
    }

    public EnableFunctionInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableFunctionInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableFunctionInvocationResponse setBody(EnableFunctionInvocationResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableFunctionInvocationResponseBody getBody() {
        return this.body;
    }

}
