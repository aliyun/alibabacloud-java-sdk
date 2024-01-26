// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UninstallPromClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UninstallPromClusterResponseBody body;

    public static UninstallPromClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        UninstallPromClusterResponse self = new UninstallPromClusterResponse();
        return TeaModel.build(map, self);
    }

    public UninstallPromClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UninstallPromClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UninstallPromClusterResponse setBody(UninstallPromClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public UninstallPromClusterResponseBody getBody() {
        return this.body;
    }

}
