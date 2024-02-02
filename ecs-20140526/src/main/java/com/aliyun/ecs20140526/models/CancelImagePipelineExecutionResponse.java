// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CancelImagePipelineExecutionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public CancelImagePipelineExecutionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CancelImagePipelineExecutionResponse setBody(CancelImagePipelineExecutionResponseBody body) {
        this.body = body;
        return this;
    }
    public CancelImagePipelineExecutionResponseBody getBody() {
        return this.body;
    }

}
