// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class RunDBCommandResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunDBCommandResponseBody body;

    public static RunDBCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunDBCommandResponse self = new RunDBCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunDBCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunDBCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunDBCommandResponse setBody(RunDBCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RunDBCommandResponseBody getBody() {
        return this.body;
    }

}
