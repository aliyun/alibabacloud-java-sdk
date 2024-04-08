// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchPutDcdnKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchPutDcdnKvWithHighCapacityResponseBody body;

    public static BatchPutDcdnKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchPutDcdnKvWithHighCapacityResponse self = new BatchPutDcdnKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public BatchPutDcdnKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchPutDcdnKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchPutDcdnKvWithHighCapacityResponse setBody(BatchPutDcdnKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchPutDcdnKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
