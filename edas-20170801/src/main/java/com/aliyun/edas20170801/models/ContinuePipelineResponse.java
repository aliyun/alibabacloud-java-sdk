// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ContinuePipelineResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ContinuePipelineResponseBody body;

    public static ContinuePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinuePipelineResponse self = new ContinuePipelineResponse();
        return TeaModel.build(map, self);
    }

    public ContinuePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinuePipelineResponse setBody(ContinuePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinuePipelineResponseBody getBody() {
        return this.body;
    }

}
