// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCertificateQuotaResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetCertificateQuotaResponseBody body;

    public static GetCertificateQuotaResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateQuotaResponse self = new GetCertificateQuotaResponse();
        return TeaModel.build(map, self);
    }

    public GetCertificateQuotaResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCertificateQuotaResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetCertificateQuotaResponse setBody(GetCertificateQuotaResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCertificateQuotaResponseBody getBody() {
        return this.body;
    }

}
