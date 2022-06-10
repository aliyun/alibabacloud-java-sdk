// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.fc_open20210406.models;

import com.aliyun.tea.*;

public class GetStatefulAsyncInvocationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public StatefulAsyncInvocation body;

    public static GetStatefulAsyncInvocationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetStatefulAsyncInvocationResponse self = new GetStatefulAsyncInvocationResponse();
        return TeaModel.build(map, self);
    }

    public GetStatefulAsyncInvocationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetStatefulAsyncInvocationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetStatefulAsyncInvocationResponse setBody(StatefulAsyncInvocation body) {
        this.body = body;
        return this;
    }
    public StatefulAsyncInvocation getBody() {
        return this.body;
    }

}
