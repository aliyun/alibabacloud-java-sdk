// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolUpdateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpPoolUpdateResponseBody body;

    public static DedicatedIpPoolUpdateResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolUpdateResponse self = new DedicatedIpPoolUpdateResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolUpdateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpPoolUpdateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpPoolUpdateResponse setBody(DedicatedIpPoolUpdateResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpPoolUpdateResponseBody getBody() {
        return this.body;
    }

}
