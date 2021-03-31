// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StartImagePipelineExecutionResponseBody body;

    public static StartImagePipelineExecutionResponse build(java.util.Map<String, ?> map) throws Exception {
        StartImagePipelineExecutionResponse self = new StartImagePipelineExecutionResponse();
        return TeaModel.build(map, self);
    }

    public StartImagePipelineExecutionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StartImagePipelineExecutionResponse setBody(StartImagePipelineExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartImagePipelineExecutionResponseBody getBody() {
        return this.body;
    }

}
