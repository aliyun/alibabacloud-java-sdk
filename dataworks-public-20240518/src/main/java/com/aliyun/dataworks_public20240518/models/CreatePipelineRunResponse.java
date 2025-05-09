// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreatePipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreatePipelineRunResponseBody body;

    public static CreatePipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineRunResponse self = new CreatePipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineRunResponse setBody(CreatePipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineRunResponseBody getBody() {
        return this.body;
    }

}
