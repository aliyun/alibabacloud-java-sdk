// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class AccosicateNetworkAclResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AccosicateNetworkAclResponseBody body;

    public static AccosicateNetworkAclResponse build(java.util.Map<String, ?> map) throws Exception {
        AccosicateNetworkAclResponse self = new AccosicateNetworkAclResponse();
        return TeaModel.build(map, self);
    }

    public AccosicateNetworkAclResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AccosicateNetworkAclResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AccosicateNetworkAclResponse setBody(AccosicateNetworkAclResponseBody body) {
        this.body = body;
        return this;
    }
    public AccosicateNetworkAclResponseBody getBody() {
        return this.body;
    }

}
