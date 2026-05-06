// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCaCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetClientCaCertificateHostnamesResponseBody body;

    public static SetClientCaCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClientCaCertificateHostnamesResponse self = new SetClientCaCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public SetClientCaCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClientCaCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetClientCaCertificateHostnamesResponse setBody(SetClientCaCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClientCaCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
