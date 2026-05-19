// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class PauseAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PauseAgentTaskResponseBody body;

    public static PauseAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        PauseAgentTaskResponse self = new PauseAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public PauseAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PauseAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PauseAgentTaskResponse setBody(PauseAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public PauseAgentTaskResponseBody getBody() {
        return this.body;
    }

}
