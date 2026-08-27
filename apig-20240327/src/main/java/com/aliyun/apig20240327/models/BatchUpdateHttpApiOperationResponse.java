// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.apig20240327.models;

import com.aliyun.tea.*;

public class BatchUpdateHttpApiOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchUpdateHttpApiOperationResponseBody body;

    public static BatchUpdateHttpApiOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateHttpApiOperationResponse self = new BatchUpdateHttpApiOperationResponse();
        return TeaModel.build(map, self);
    }

    public BatchUpdateHttpApiOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchUpdateHttpApiOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchUpdateHttpApiOperationResponse setBody(BatchUpdateHttpApiOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchUpdateHttpApiOperationResponseBody getBody() {
        return this.body;
    }

}
