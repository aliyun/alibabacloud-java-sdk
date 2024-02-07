// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ProvisionAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ProvisionAccessConfigurationResponseBody body;

    public static ProvisionAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        ProvisionAccessConfigurationResponse self = new ProvisionAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public ProvisionAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ProvisionAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ProvisionAccessConfigurationResponse setBody(ProvisionAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public ProvisionAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
