// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigClusterNameResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigClusterNameResponseBody body;

    public static ConfigClusterNameResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigClusterNameResponse self = new ConfigClusterNameResponse();
        return TeaModel.build(map, self);
    }

    public ConfigClusterNameResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigClusterNameResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigClusterNameResponse setBody(ConfigClusterNameResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigClusterNameResponseBody getBody() {
        return this.body;
    }

}
