// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dm20151123.models;

import com.aliyun.tea.*;

public class ConfigSetCancelRelationFromAddressResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ConfigSetCancelRelationFromAddressResponseBody body;

    public static ConfigSetCancelRelationFromAddressResponse build(java.util.Map<String, ?> map) throws Exception {
        ConfigSetCancelRelationFromAddressResponse self = new ConfigSetCancelRelationFromAddressResponse();
        return TeaModel.build(map, self);
    }

    public ConfigSetCancelRelationFromAddressResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConfigSetCancelRelationFromAddressResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConfigSetCancelRelationFromAddressResponse setBody(ConfigSetCancelRelationFromAddressResponseBody body) {
        this.body = body;
        return this;
    }
    public ConfigSetCancelRelationFromAddressResponseBody getBody() {
        return this.body;
    }

}
