// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class BatchDeleteDcdnKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public BatchDeleteDcdnKvWithHighCapacityResponseBody body;

    public static BatchDeleteDcdnKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteDcdnKvWithHighCapacityResponse self = new BatchDeleteDcdnKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public BatchDeleteDcdnKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public BatchDeleteDcdnKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public BatchDeleteDcdnKvWithHighCapacityResponse setBody(BatchDeleteDcdnKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public BatchDeleteDcdnKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
