// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineInstanceStatusResponseBody body;

    public static GetPipelineInstanceStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceStatusResponse self = new GetPipelineInstanceStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineInstanceStatusResponse setBody(GetPipelineInstanceStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineInstanceStatusResponseBody getBody() {
        return this.body;
    }

}
