// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class DeprovisionAccessConfigurationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeprovisionAccessConfigurationResponseBody body;

    public static DeprovisionAccessConfigurationResponse build(java.util.Map<String, ?> map) throws Exception {
        DeprovisionAccessConfigurationResponse self = new DeprovisionAccessConfigurationResponse();
        return TeaModel.build(map, self);
    }

    public DeprovisionAccessConfigurationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeprovisionAccessConfigurationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeprovisionAccessConfigurationResponse setBody(DeprovisionAccessConfigurationResponseBody body) {
        this.body = body;
        return this;
    }
    public DeprovisionAccessConfigurationResponseBody getBody() {
        return this.body;
    }

}
