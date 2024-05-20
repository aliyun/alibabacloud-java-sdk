// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cgcs20211111.models;

import com.aliyun.tea.*;

public class ReleaseCapacityResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ReleaseCapacityResponseBody body;

    public static ReleaseCapacityResponse build(java.util.Map<String, ?> map) throws Exception {
        ReleaseCapacityResponse self = new ReleaseCapacityResponse();
        return TeaModel.build(map, self);
    }

    public ReleaseCapacityResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ReleaseCapacityResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ReleaseCapacityResponse setBody(ReleaseCapacityResponseBody body) {
        this.body = body;
        return this;
    }
    public ReleaseCapacityResponseBody getBody() {
        return this.body;
    }

}
