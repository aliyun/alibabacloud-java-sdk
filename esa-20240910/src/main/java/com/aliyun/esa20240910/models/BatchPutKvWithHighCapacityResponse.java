// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class BatchPutKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPutKvWithHighCapacityResponseBody body;

    public static BatchPutKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPutKvWithHighCapacityResponse self = new BatchPutKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public BatchPutKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPutKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPutKvWithHighCapacityResponse setBody(BatchPutKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPutKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
