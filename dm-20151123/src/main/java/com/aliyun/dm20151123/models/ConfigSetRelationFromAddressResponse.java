// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetRelationFromAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetRelationFromAddressResponseBody body;

    public static ConfigSetRelationFromAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetRelationFromAddressResponse self = new ConfigSetRelationFromAddressResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetRelationFromAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetRelationFromAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetRelationFromAddressResponse setBody(ConfigSetRelationFromAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetRelationFromAddressResponseBody getBody() {
        return this.body;
    }

}
