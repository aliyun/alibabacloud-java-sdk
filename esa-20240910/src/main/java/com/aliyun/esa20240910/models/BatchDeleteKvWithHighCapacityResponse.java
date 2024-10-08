// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchDeleteKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteKvWithHighCapacityResponseBody body;

    public static BatchDeleteKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteKvWithHighCapacityResponse self = new BatchDeleteKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteKvWithHighCapacityResponse setBody(BatchDeleteKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
