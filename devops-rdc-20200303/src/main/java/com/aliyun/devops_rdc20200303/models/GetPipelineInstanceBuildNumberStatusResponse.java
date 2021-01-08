// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceBuildNumberStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineInstanceBuildNumberStatusResponseBody body;

    public static GetPipelineInstanceBuildNumberStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceBuildNumberStatusResponse self = new GetPipelineInstanceBuildNumberStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceBuildNumberStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineInstanceBuildNumberStatusResponse setBody(GetPipelineInstanceBuildNumberStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineInstanceBuildNumberStatusResponseBody getBody() {
        return this.body;
    }

}
