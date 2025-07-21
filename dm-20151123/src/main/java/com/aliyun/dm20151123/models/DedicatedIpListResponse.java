// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpListResponseBody body;

    public static DedicatedIpListResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpListResponse self = new DedicatedIpListResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpListResponse setBody(DedicatedIpListResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpListResponseBody getBody() {
        return this.body;
    }

}
