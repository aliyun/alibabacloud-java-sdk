// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificateDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertificateDetailResponseBody body;

    public static GetCertificateDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateDetailResponse self = new GetCertificateDetailResponse();
        return TeaModel.build(map, self);
    }

    public GetCertificateDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertificateDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertificateDetailResponse setBody(GetCertificateDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertificateDetailResponseBody getBody() {
        return this.body;
    }

}
