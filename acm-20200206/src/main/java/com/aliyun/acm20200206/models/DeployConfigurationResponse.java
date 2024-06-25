// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.acm20200206.models;

import com.aliyun.tea.*;

public class DeployConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeployConfigurationResponseBody body;

    public static DeployConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeployConfigurationResponse self = new DeployConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeployConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeployConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeployConfigurationResponse setBody(DeployConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeployConfigurationResponseBody getBody() {
        return this.body;
    }

}
