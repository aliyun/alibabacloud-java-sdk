// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDNSSLBStatusResponseBody body;

    public static SetDNSSLBStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDNSSLBStatusResponse self = new SetDNSSLBStatusResponse();
        return TeaModel.build(map, self);
    }

    public SetDNSSLBStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDNSSLBStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDNSSLBStatusResponse setBody(SetDNSSLBStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDNSSLBStatusResponseBody getBody() {
        return this.body;
    }

}
