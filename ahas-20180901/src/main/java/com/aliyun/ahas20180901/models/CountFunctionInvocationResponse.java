// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class CountFunctionInvocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CountFunctionInvocationResponseBody body;

    public static CountFunctionInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        CountFunctionInvocationResponse self = new CountFunctionInvocationResponse();
        return TeaModel.build(map, self);
    }

    public CountFunctionInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CountFunctionInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CountFunctionInvocationResponse setBody(CountFunctionInvocationResponseBody body) {
        this.body = body;
        return this;
    }
    public CountFunctionInvocationResponseBody getBody() {
        return this.body;
    }

}
