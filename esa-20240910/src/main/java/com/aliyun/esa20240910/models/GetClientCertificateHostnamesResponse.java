// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientCertificateHostnamesResponseBody body;

    public static GetClientCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientCertificateHostnamesResponse self = new GetClientCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public GetClientCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientCertificateHostnamesResponse setBody(GetClientCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
