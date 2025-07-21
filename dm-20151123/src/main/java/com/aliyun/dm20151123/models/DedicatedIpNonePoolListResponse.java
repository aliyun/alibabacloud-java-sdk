// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpNonePoolListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpNonePoolListResponseBody body;

    public static DedicatedIpNonePoolListResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpNonePoolListResponse self = new DedicatedIpNonePoolListResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpNonePoolListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpNonePoolListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpNonePoolListResponse setBody(DedicatedIpNonePoolListResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpNonePoolListResponseBody getBody() {
        return this.body;
    }

}
