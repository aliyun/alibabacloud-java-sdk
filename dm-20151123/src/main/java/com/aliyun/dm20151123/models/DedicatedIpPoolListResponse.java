// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpPoolListResponseBody body;

    public static DedicatedIpPoolListResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolListResponse self = new DedicatedIpPoolListResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpPoolListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpPoolListResponse setBody(DedicatedIpPoolListResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpPoolListResponseBody getBody() {
        return this.body;
    }

}
