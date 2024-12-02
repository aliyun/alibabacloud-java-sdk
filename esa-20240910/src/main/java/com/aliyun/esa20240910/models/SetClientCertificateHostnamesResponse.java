// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class SetClientCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetClientCertificateHostnamesResponseBody body;

    public static SetClientCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        SetClientCertificateHostnamesResponse self = new SetClientCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public SetClientCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetClientCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetClientCertificateHostnamesResponse setBody(SetClientCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public SetClientCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
