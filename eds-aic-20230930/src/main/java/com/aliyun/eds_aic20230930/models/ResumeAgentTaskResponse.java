// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eds_aic20230930.models;

import com.aliyun.tea.*;

public class ResumeAgentTaskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ResumeAgentTaskResponseBody body;

    public static ResumeAgentTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ResumeAgentTaskResponse self = new ResumeAgentTaskResponse();
        return TeaModel.build(map, self);
    }

    public ResumeAgentTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ResumeAgentTaskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ResumeAgentTaskResponse setBody(ResumeAgentTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ResumeAgentTaskResponseBody getBody() {
        return this.body;
    }

}
