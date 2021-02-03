// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class SetDNSSLBStatusResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SetDNSSLBStatusResponse setBody(SetDNSSLBStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDNSSLBStatusResponseBody getBody() {
        return this.body;
    }

}
