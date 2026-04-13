// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class RunAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RunAgentTaskResponseBody body;

    public static RunAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        RunAgentTaskResponse self = new RunAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public RunAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RunAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RunAgentTaskResponse setBody(RunAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public RunAgentTaskResponseBody getBody() {
        return this.body;
    }

}
