// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class InvokeContainerResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public InvokeContainerResponseBody body;

    public static InvokeContainerResponse build(java.util.Map<String, ?> map) throws Exception {
        InvokeContainerResponse self = new InvokeContainerResponse();
        return TeaModel.build(map, self);
    }

    public InvokeContainerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public InvokeContainerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public InvokeContainerResponse setBody(InvokeContainerResponseBody body) {
        this.body = body;
        return this;
    }
    public InvokeContainerResponseBody getBody() {
        return this.body;
    }

}
