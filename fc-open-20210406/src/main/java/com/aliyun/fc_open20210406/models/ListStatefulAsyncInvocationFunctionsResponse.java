// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListStatefulAsyncInvocationFunctionsResponseBody body;

    public static ListStatefulAsyncInvocationFunctionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListStatefulAsyncInvocationFunctionsResponse self = new ListStatefulAsyncInvocationFunctionsResponse();
        return TeaModel.build(map, self);
    }

    public ListStatefulAsyncInvocationFunctionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListStatefulAsyncInvocationFunctionsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListStatefulAsyncInvocationFunctionsResponse setBody(ListStatefulAsyncInvocationFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatefulAsyncInvocationFunctionsResponseBody getBody() {
        return this.body;
    }

}
