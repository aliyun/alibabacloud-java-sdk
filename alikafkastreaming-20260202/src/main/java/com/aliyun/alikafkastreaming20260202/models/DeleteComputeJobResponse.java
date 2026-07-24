// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class DeleteComputeJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComputeJobResponseBody body;

    public static DeleteComputeJobResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeJobResponse self = new DeleteComputeJobResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComputeJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComputeJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComputeJobResponse setBody(DeleteComputeJobResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComputeJobResponseBody getBody() {
        return this.body;
    }

}
