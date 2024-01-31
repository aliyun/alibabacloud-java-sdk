// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DeployPolicyInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployPolicyInstanceResponseBody body;

    public static DeployPolicyInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployPolicyInstanceResponse self = new DeployPolicyInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeployPolicyInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployPolicyInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployPolicyInstanceResponse setBody(DeployPolicyInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployPolicyInstanceResponseBody getBody() {
        return this.body;
    }

}
