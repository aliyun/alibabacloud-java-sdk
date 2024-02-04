// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class UpdateBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateBatchResponseBody body;

    public static UpdateBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateBatchResponse self = new UpdateBatchResponse();
        return TeaModel.build(map, self);
    }

    public UpdateBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateBatchResponse setBody(UpdateBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateBatchResponseBody getBody() {
        return this.body;
    }

}
