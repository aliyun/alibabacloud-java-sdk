// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolCreateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpPoolCreateResponseBody body;

    public static DedicatedIpPoolCreateResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolCreateResponse self = new DedicatedIpPoolCreateResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolCreateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpPoolCreateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpPoolCreateResponse setBody(DedicatedIpPoolCreateResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpPoolCreateResponseBody getBody() {
        return this.body;
    }

}
