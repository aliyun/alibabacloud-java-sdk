// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615.models;

import com.aliyun.tea.*;

public class DeployLdpsSemiManagedComponentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployLdpsSemiManagedComponentResponseBody body;

    public static DeployLdpsSemiManagedComponentResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployLdpsSemiManagedComponentResponse self = new DeployLdpsSemiManagedComponentResponse();
        return TeaModel.build(map, self);
    }

    public DeployLdpsSemiManagedComponentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployLdpsSemiManagedComponentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployLdpsSemiManagedComponentResponse setBody(DeployLdpsSemiManagedComponentResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployLdpsSemiManagedComponentResponseBody getBody() {
        return this.body;
    }

}
