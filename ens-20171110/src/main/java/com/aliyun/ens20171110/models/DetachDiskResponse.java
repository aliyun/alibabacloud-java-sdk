// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class DetachDiskResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DetachDiskResponseBody body;

    public static DetachDiskResponse build(java.util.Map<String, ?> map) throws Exception {
        DetachDiskResponse self = new DetachDiskResponse();
        return TeaModel.build(map, self);
    }

    public DetachDiskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DetachDiskResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DetachDiskResponse setBody(DetachDiskResponseBody body) {
        this.body = body;
        return this;
    }
    public DetachDiskResponseBody getBody() {
        return this.body;
    }

}
