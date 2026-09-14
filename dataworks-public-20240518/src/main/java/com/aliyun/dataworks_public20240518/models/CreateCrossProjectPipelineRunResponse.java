// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class CreateCrossProjectPipelineRunResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateCrossProjectPipelineRunResponseBody body;

    public static CreateCrossProjectPipelineRunResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateCrossProjectPipelineRunResponse self = new CreateCrossProjectPipelineRunResponse();
        return TeaModel.build(map, self);
    }

    public CreateCrossProjectPipelineRunResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateCrossProjectPipelineRunResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateCrossProjectPipelineRunResponse setBody(CreateCrossProjectPipelineRunResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateCrossProjectPipelineRunResponseBody getBody() {
        return this.body;
    }

}
