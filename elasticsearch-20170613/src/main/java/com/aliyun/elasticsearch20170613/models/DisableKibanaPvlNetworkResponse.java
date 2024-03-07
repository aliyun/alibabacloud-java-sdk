// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class DisableKibanaPvlNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableKibanaPvlNetworkResponseBody body;

    public static DisableKibanaPvlNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableKibanaPvlNetworkResponse self = new DisableKibanaPvlNetworkResponse();
        return TeaModel.build(map, self);
    }

    public DisableKibanaPvlNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableKibanaPvlNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableKibanaPvlNetworkResponse setBody(DisableKibanaPvlNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableKibanaPvlNetworkResponseBody getBody() {
        return this.body;
    }

}
