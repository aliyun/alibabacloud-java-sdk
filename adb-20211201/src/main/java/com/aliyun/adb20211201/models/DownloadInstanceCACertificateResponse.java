// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class DownloadInstanceCACertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DownloadInstanceCACertificateResponseBody body;

    public static DownloadInstanceCACertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DownloadInstanceCACertificateResponse self = new DownloadInstanceCACertificateResponse();
        return TeaModel.build(map, self);
    }

    public DownloadInstanceCACertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DownloadInstanceCACertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DownloadInstanceCACertificateResponse setBody(DownloadInstanceCACertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DownloadInstanceCACertificateResponseBody getBody() {
        return this.body;
    }

}
