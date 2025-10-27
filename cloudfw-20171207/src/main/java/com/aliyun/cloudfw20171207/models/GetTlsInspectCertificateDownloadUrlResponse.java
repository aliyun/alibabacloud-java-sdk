// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class GetTlsInspectCertificateDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetTlsInspectCertificateDownloadUrlResponseBody body;

    public static GetTlsInspectCertificateDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetTlsInspectCertificateDownloadUrlResponse self = new GetTlsInspectCertificateDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetTlsInspectCertificateDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetTlsInspectCertificateDownloadUrlResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetTlsInspectCertificateDownloadUrlResponse setBody(GetTlsInspectCertificateDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetTlsInspectCertificateDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
