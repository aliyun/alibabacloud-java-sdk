// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class DisableSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DisableSSLResponseBody body;

    public static DisableSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        DisableSSLResponse self = new DisableSSLResponse();
        return TeaModel.build(map, self);
    }

    public DisableSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DisableSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DisableSSLResponse setBody(DisableSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public DisableSSLResponseBody getBody() {
        return this.body;
    }

}
