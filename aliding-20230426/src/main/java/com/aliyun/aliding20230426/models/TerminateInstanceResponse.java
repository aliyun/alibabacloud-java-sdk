// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aliding20230426.models;

import com.aliyun.tea.*;

public class TerminateInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminateInstanceResponseBody body;

    public static TerminateInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminateInstanceResponse self = new TerminateInstanceResponse();
        return TeaModel.build(map, self);
    }

    public TerminateInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminateInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminateInstanceResponse setBody(TerminateInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminateInstanceResponseBody getBody() {
        return this.body;
    }

}
