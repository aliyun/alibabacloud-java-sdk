// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class DeleteComputeInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteComputeInstanceResponseBody body;

    public static DeleteComputeInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteComputeInstanceResponse self = new DeleteComputeInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteComputeInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteComputeInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteComputeInstanceResponse setBody(DeleteComputeInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteComputeInstanceResponseBody getBody() {
        return this.body;
    }

}
