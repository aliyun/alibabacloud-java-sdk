// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public CancelImagePipelineExecutionResponseBody body;

    public static CancelImagePipelineExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        CancelImagePipelineExecutionResponse self = new CancelImagePipelineExecutionResponse();
        return TeaModel.build(map, self);
    }

    public CancelImagePipelineExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CancelImagePipelineExecutionResponse setBody(CancelImagePipelineExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelImagePipelineExecutionResponseBody getBody() {
        return this.body;
    }

}
