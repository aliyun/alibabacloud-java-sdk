// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterSubnetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigClusterSubnetResponseBody body;

    public static ConfigClusterSubnetResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterSubnetResponse self = new ConfigClusterSubnetResponse();
        return TeaModel.build(map, self);
    }

    public ConfigClusterSubnetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigClusterSubnetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigClusterSubnetResponse setBody(ConfigClusterSubnetResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigClusterSubnetResponseBody getBody() {
        return this.body;
    }

}
