// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class TerminatePhysicalConnectionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public TerminatePhysicalConnectionResponseBody body;

    public static TerminatePhysicalConnectionResponse build(java.util.Map<String, ?> map) throws Exception {
        TerminatePhysicalConnectionResponse self = new TerminatePhysicalConnectionResponse();
        return TeaModel.build(map, self);
    }

    public TerminatePhysicalConnectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public TerminatePhysicalConnectionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public TerminatePhysicalConnectionResponse setBody(TerminatePhysicalConnectionResponseBody body) {
        this.body = body;
        return this;
    }
    public TerminatePhysicalConnectionResponseBody getBody() {
        return this.body;
    }

}
