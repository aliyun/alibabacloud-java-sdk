// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCaCertificateHostnamesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetClientCaCertificateHostnamesResponseBody body;

    public static GetClientCaCertificateHostnamesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetClientCaCertificateHostnamesResponse self = new GetClientCaCertificateHostnamesResponse();
        return TeaModel.build(map, self);
    }

    public GetClientCaCertificateHostnamesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetClientCaCertificateHostnamesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetClientCaCertificateHostnamesResponse setBody(GetClientCaCertificateHostnamesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetClientCaCertificateHostnamesResponseBody getBody() {
        return this.body;
    }

}
