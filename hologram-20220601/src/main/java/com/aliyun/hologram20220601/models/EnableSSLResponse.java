// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hologram20220601.models;

import com.aliyun.tea.*;

public class EnableSSLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public EnableSSLResponseBody body;

    public static EnableSSLResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSSLResponse self = new EnableSSLResponse();
        return TeaModel.build(map, self);
    }

    public EnableSSLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSSLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public EnableSSLResponse setBody(EnableSSLResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSSLResponseBody getBody() {
        return this.body;
    }

}
