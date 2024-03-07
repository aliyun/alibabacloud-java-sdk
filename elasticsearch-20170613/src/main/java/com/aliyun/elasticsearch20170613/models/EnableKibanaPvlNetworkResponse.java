// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.elasticsearch20170613.models;

import com.aliyun.tea.*;

public class EnableKibanaPvlNetworkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableKibanaPvlNetworkResponseBody body;

    public static EnableKibanaPvlNetworkResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableKibanaPvlNetworkResponse self = new EnableKibanaPvlNetworkResponse();
        return TeaModel.build(map, self);
    }

    public EnableKibanaPvlNetworkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableKibanaPvlNetworkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableKibanaPvlNetworkResponse setBody(EnableKibanaPvlNetworkResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableKibanaPvlNetworkResponseBody getBody() {
        return this.body;
    }

}
