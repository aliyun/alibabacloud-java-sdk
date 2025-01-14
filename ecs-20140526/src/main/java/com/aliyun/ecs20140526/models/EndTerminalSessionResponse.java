// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class EndTerminalSessionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EndTerminalSessionResponseBody body;

    public static EndTerminalSessionResponse build(java.util.Map<String, ?> map) throws Exception {
        EndTerminalSessionResponse self = new EndTerminalSessionResponse();
        return TeaModel.build(map, self);
    }

    public EndTerminalSessionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EndTerminalSessionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EndTerminalSessionResponse setBody(EndTerminalSessionResponseBody body) {
        this.body = body;
        return this;
    }
    public EndTerminalSessionResponseBody getBody() {
        return this.body;
    }

}
