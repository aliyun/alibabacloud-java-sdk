// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityByBatchResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseCapacityByBatchResponseBody body;

    public static ReleaseCapacityByBatchResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityByBatchResponse self = new ReleaseCapacityByBatchResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityByBatchResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseCapacityByBatchResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseCapacityByBatchResponse setBody(ReleaseCapacityByBatchResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseCapacityByBatchResponseBody getBody() {
        return this.body;
    }

}
