// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class ListStatefulAsyncInvocationFunctionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

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

    public ListStatefulAsyncInvocationFunctionsResponse setBody(ListStatefulAsyncInvocationFunctionsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListStatefulAsyncInvocationFunctionsResponseBody getBody() {
        return this.body;
    }

}
