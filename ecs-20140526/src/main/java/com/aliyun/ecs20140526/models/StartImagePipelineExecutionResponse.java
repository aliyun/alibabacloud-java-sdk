// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class StartImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StartImagePipelineExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StartImagePipelineExecutionResponse setBody(StartImagePipelineExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public StartImagePipelineExecutionResponseBody getBody() {
        return this.body;
    }

}
