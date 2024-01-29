// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StopPipelineJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public StopPipelineJobRunResponseBody body;

    public static StopPipelineJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        StopPipelineJobRunResponse self = new StopPipelineJobRunResponse();
        return TeaModel.build(map, self);
    }

    public StopPipelineJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopPipelineJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopPipelineJobRunResponse setBody(StopPipelineJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public StopPipelineJobRunResponseBody getBody() {
        return this.body;
    }

}
