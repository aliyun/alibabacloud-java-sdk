// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class RunNodeOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunNodeOperationResponseBody body;

    public static RunNodeOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        RunNodeOperationResponse self = new RunNodeOperationResponse();
        return TeaModel.build(map, self);
    }

    public RunNodeOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunNodeOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunNodeOperationResponse setBody(RunNodeOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public RunNodeOperationResponseBody getBody() {
        return this.body;
    }

}
