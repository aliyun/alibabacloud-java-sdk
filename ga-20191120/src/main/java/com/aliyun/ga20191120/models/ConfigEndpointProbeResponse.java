// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class ConfigEndpointProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigEndpointProbeResponseBody body;

    public static ConfigEndpointProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigEndpointProbeResponse self = new ConfigEndpointProbeResponse();
        return TeaModel.build(map, self);
    }

    public ConfigEndpointProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigEndpointProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigEndpointProbeResponse setBody(ConfigEndpointProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigEndpointProbeResponseBody getBody() {
        return this.body;
    }

}
