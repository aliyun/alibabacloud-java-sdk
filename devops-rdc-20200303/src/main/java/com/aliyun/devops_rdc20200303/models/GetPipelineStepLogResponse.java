// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineStepLogResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineStepLogResponseBody body;

    public static GetPipelineStepLogResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineStepLogResponse self = new GetPipelineStepLogResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineStepLogResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineStepLogResponse setBody(GetPipelineStepLogResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineStepLogResponseBody getBody() {
        return this.body;
    }

}
