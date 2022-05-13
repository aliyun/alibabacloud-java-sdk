// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class RunCommandResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public RunCommandResponseBody body;

    public static RunCommandResponse build(java.util.Map<String, ?> map) throws Exception {
        RunCommandResponse self = new RunCommandResponse();
        return TeaModel.build(map, self);
    }

    public RunCommandResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunCommandResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunCommandResponse setBody(RunCommandResponseBody body) {
        this.body = body;
        return this;
    }
    public RunCommandResponseBody getBody() {
        return this.body;
    }

}
