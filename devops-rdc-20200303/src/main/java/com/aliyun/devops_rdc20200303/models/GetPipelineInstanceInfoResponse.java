// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPipelineInstanceInfoResponseBody body;

    public static GetPipelineInstanceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceInfoResponse self = new GetPipelineInstanceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPipelineInstanceInfoResponse setBody(GetPipelineInstanceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPipelineInstanceInfoResponseBody getBody() {
        return this.body;
    }

}
