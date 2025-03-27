// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetOriginClientCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOriginClientCertificateHostnamesResponseBody body;

    public static GetOriginClientCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOriginClientCertificateHostnamesResponse self = new GetOriginClientCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public GetOriginClientCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOriginClientCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOriginClientCertificateHostnamesResponse setBody(GetOriginClientCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOriginClientCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
