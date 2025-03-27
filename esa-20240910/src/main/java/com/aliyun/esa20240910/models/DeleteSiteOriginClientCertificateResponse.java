// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class DeleteSiteOriginClientCertificateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteSiteOriginClientCertificateResponseBody body;

    public static DeleteSiteOriginClientCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteSiteOriginClientCertificateResponse self = new DeleteSiteOriginClientCertificateResponse();
        return TeaModel.build(map, self);
    }

    public DeleteSiteOriginClientCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteSiteOriginClientCertificateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteSiteOriginClientCertificateResponse setBody(DeleteSiteOriginClientCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteSiteOriginClientCertificateResponseBody getBody() {
        return this.body;
    }

}
