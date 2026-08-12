// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class PreviewDataPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PreviewDataPipelineResponseBody body;

    public static PreviewDataPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        PreviewDataPipelineResponse self = new PreviewDataPipelineResponse();
        return TeaModel.build(map, self);
    }

    public PreviewDataPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PreviewDataPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PreviewDataPipelineResponse setBody(PreviewDataPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public PreviewDataPipelineResponseBody getBody() {
        return this.body;
    }

}
