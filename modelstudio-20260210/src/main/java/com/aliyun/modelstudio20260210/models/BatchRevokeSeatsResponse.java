// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.modelstudio20260210.models;

import com.aliyun.tea.*;

public class BatchRevokeSeatsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchRevokeSeatsResponseBody body;

    public static BatchRevokeSeatsResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchRevokeSeatsResponse self = new BatchRevokeSeatsResponse();
        return TeaModel.build(map, self);
    }

    public BatchRevokeSeatsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchRevokeSeatsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchRevokeSeatsResponse setBody(BatchRevokeSeatsResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchRevokeSeatsResponseBody getBody() {
        return this.body;
    }

}
