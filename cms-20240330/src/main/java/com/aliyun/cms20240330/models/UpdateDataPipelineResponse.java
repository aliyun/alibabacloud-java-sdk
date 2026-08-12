// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class UpdateDataPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateDataPipelineResponseBody body;

    public static UpdateDataPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateDataPipelineResponse self = new UpdateDataPipelineResponse();
        return TeaModel.build(map, self);
    }

    public UpdateDataPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateDataPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateDataPipelineResponse setBody(UpdateDataPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateDataPipelineResponseBody getBody() {
        return this.body;
    }

}
