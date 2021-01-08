// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceGroupStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineInstanceGroupStatusResponseBody body;

    public static GetPipelineInstanceGroupStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceGroupStatusResponse self = new GetPipelineInstanceGroupStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceGroupStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineInstanceGroupStatusResponse setBody(GetPipelineInstanceGroupStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineInstanceGroupStatusResponseBody getBody() {
        return this.body;
    }

}
