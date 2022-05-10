// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CreatePipelineNodeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public CreatePipelineNodeInstanceResponseBody body;

    public static CreatePipelineNodeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        CreatePipelineNodeInstanceResponse self = new CreatePipelineNodeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public CreatePipelineNodeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreatePipelineNodeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreatePipelineNodeInstanceResponse setBody(CreatePipelineNodeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public CreatePipelineNodeInstanceResponseBody getBody() {
        return this.body;
    }

}
