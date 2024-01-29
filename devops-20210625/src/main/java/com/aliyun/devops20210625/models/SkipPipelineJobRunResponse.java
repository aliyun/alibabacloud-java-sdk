// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class SkipPipelineJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SkipPipelineJobRunResponseBody body;

    public static SkipPipelineJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        SkipPipelineJobRunResponse self = new SkipPipelineJobRunResponse();
        return TeaModel.build(map, self);
    }

    public SkipPipelineJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SkipPipelineJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SkipPipelineJobRunResponse setBody(SkipPipelineJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public SkipPipelineJobRunResponseBody getBody() {
        return this.body;
    }

}
