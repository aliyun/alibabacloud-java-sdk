// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class CreateImagePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateImagePipelineResponseBody body;

    public static CreateImagePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateImagePipelineResponse self = new CreateImagePipelineResponse();
        return TeaModel.build(map, self);
    }

    public CreateImagePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateImagePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateImagePipelineResponse setBody(CreateImagePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateImagePipelineResponseBody getBody() {
        return this.body;
    }

}
