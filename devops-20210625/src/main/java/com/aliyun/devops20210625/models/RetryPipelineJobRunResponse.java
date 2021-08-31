// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RetryPipelineJobRunResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public RetryPipelineJobRunResponse setBody(RetryPipelineJobRunResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryPipelineJobRunResponseBody getBody() {
        return this.body;
    }

}
