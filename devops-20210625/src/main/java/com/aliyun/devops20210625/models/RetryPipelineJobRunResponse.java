// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RetryPipelineJobRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryPipelineJobRunResponseBody body;

    public static RetryPipelineJobRunResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryPipelineJobRunResponse self = new RetryPipelineJobRunResponse();
        return TeaModel.build(map, self);
    }

    public RetryPipelineJobRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryPipelineJobRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryPipelineJobRunResponse setBody(RetryPipelineJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryPipelineJobRunResponseBody getBody() {
        return this.body;
    }

}
