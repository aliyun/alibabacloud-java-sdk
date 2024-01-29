// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class DeletePipelineRelationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeletePipelineRelationsResponseBody body;

    public static DeletePipelineRelationsResponse build(java.util.Map<String, ?> map) throws Exception {
        DeletePipelineRelationsResponse self = new DeletePipelineRelationsResponse();
        return TeaModel.build(map, self);
    }

    public DeletePipelineRelationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeletePipelineRelationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeletePipelineRelationsResponse setBody(DeletePipelineRelationsResponseBody body) {
        this.body = body;
        return this;
    }
    public DeletePipelineRelationsResponseBody getBody() {
        return this.body;
    }

}
