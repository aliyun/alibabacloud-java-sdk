// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetOriginClientCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetOriginClientCertificateHostnamesResponseBody body;

    public static SetOriginClientCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetOriginClientCertificateHostnamesResponse self = new SetOriginClientCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public SetOriginClientCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetOriginClientCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetOriginClientCertificateHostnamesResponse setBody(SetOriginClientCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetOriginClientCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
