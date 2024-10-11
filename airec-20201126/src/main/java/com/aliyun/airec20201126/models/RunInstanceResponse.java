// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20201126.models;

import com.aliyun.tea.*;

public class RunInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunInstanceResponseBody body;

    public static RunInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RunInstanceResponse self = new RunInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RunInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunInstanceResponse setBody(RunInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RunInstanceResponseBody getBody() {
        return this.body;
    }

}
