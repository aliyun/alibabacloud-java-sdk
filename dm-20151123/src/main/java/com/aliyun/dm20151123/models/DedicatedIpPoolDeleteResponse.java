// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class DedicatedIpPoolDeleteResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DedicatedIpPoolDeleteResponseBody body;

    public static DedicatedIpPoolDeleteResponse build(java.util.Map<String, ?> map) throws Exception {
        DedicatedIpPoolDeleteResponse self = new DedicatedIpPoolDeleteResponse();
        return TeaModel.build(map, self);
    }

    public DedicatedIpPoolDeleteResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DedicatedIpPoolDeleteResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DedicatedIpPoolDeleteResponse setBody(DedicatedIpPoolDeleteResponseBody body) {
        this.body = body;
        return this;
    }
    public DedicatedIpPoolDeleteResponseBody getBody() {
        return this.body;
    }

}
