// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class PutDcdnKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutDcdnKvWithHighCapacityResponseBody body;

    public static PutDcdnKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        PutDcdnKvWithHighCapacityResponse self = new PutDcdnKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public PutDcdnKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutDcdnKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutDcdnKvWithHighCapacityResponse setBody(PutDcdnKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public PutDcdnKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
