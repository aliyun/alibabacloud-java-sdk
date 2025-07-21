// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpChangeWarmupTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpChangeWarmupTypeResponseBody body;

    public static DedicatedIpChangeWarmupTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpChangeWarmupTypeResponse self = new DedicatedIpChangeWarmupTypeResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpChangeWarmupTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpChangeWarmupTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpChangeWarmupTypeResponse setBody(DedicatedIpChangeWarmupTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpChangeWarmupTypeResponseBody getBody() {
        return this.body;
    }

}
