// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class PutKvWithHighCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public PutKvWithHighCapacityResponseBody body;

    public static PutKvWithHighCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        PutKvWithHighCapacityResponse self = new PutKvWithHighCapacityResponse();
        return TeaModel.build(map, self);
    }

    public PutKvWithHighCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public PutKvWithHighCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public PutKvWithHighCapacityResponse setBody(PutKvWithHighCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public PutKvWithHighCapacityResponseBody getBody() {
        return this.body;
    }

}
