// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class DeletePipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePipelineResponseBody body;

    public static DeletePipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineResponse self = new DeletePipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineResponse setBody(DeletePipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineResponseBody getBody() {
        return this.body;
    }

}
