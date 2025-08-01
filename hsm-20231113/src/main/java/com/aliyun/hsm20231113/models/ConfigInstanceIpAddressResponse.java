// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hsm20231113.models;

import com.aliyun.tea.*;

public class ConfigInstanceIpAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigInstanceIpAddressResponseBody body;

    public static ConfigInstanceIpAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigInstanceIpAddressResponse self = new ConfigInstanceIpAddressResponse();
        return TeaModel.build(map, self);
    }

    public ConfigInstanceIpAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigInstanceIpAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigInstanceIpAddressResponse setBody(ConfigInstanceIpAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigInstanceIpAddressResponseBody getBody() {
        return this.body;
    }

}
