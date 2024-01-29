// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class LogPipelineJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public LogPipelineJobRunResponseBody body;

    public static LogPipelineJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        LogPipelineJobRunResponse self = new LogPipelineJobRunResponse();
        return TeaModel.build(map, self);
    }

    public LogPipelineJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public LogPipelineJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public LogPipelineJobRunResponse setBody(LogPipelineJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public LogPipelineJobRunResponseBody getBody() {
        return this.body;
    }

}
