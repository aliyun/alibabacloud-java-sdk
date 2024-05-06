// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hbase20170115.models;

import com.aliyun.tea.*;

public class RenewClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RenewClusterResponseBody body;

    public static RenewClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        RenewClusterResponse self = new RenewClusterResponse();
        return TeaModel.build(map, self);
    }

    public RenewClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RenewClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RenewClusterResponse setBody(RenewClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public RenewClusterResponseBody getBody() {
        return this.body;
    }

}
