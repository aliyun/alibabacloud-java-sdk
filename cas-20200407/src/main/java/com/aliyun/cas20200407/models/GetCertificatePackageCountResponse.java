// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificatePackageCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertificatePackageCountResponseBody body;

    public static GetCertificatePackageCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertificatePackageCountResponse self = new GetCertificatePackageCountResponse();
        return TeaModel.build(map, self);
    }

    public GetCertificatePackageCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertificatePackageCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertificatePackageCountResponse setBody(GetCertificatePackageCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertificatePackageCountResponseBody getBody() {
        return this.body;
    }

}
