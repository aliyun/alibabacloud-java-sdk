// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class UpdatePipelineEnvVarsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdatePipelineEnvVarsResponseBody body;

    public static UpdatePipelineEnvVarsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdatePipelineEnvVarsResponse self = new UpdatePipelineEnvVarsResponse();
        return TeaModel.build(map, self);
    }

    public UpdatePipelineEnvVarsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdatePipelineEnvVarsResponse setBody(UpdatePipelineEnvVarsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdatePipelineEnvVarsResponseBody getBody() {
        return this.body;
    }

}
