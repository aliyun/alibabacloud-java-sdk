// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DeleteImagePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteImagePipelineResponseBody body;

    public static DeleteImagePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteImagePipelineResponse self = new DeleteImagePipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteImagePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteImagePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteImagePipelineResponse setBody(DeleteImagePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteImagePipelineResponseBody getBody() {
        return this.body;
    }

}
