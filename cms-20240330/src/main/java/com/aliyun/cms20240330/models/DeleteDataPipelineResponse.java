// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class DeleteDataPipelineResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDataPipelineResponseBody body;

    public static DeleteDataPipelineResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDataPipelineResponse self = new DeleteDataPipelineResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDataPipelineResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDataPipelineResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDataPipelineResponse setBody(DeleteDataPipelineResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDataPipelineResponseBody getBody() {
        return this.body;
    }

}
