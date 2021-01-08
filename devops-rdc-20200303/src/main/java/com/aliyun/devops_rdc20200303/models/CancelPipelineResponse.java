// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CancelPipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelPipelineResponseBody body;

    public static CancelPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelPipelineResponse self = new CancelPipelineResponse();
        return TeaModel.build(map, self);
    }

    public CancelPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelPipelineResponse setBody(CancelPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelPipelineResponseBody getBody() {
        return this.body;
    }

}
