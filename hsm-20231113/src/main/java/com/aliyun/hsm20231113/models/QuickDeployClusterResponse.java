// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class QuickDeployClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public QuickDeployClusterResponseBody body;

    public static QuickDeployClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        QuickDeployClusterResponse self = new QuickDeployClusterResponse();
        return TeaModel.build(map, self);
    }

    public QuickDeployClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QuickDeployClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public QuickDeployClusterResponse setBody(QuickDeployClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public QuickDeployClusterResponseBody getBody() {
        return this.body;
    }

}
