// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListSiteOriginClientCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListSiteOriginClientCertificatesResponseBody body;

    public static ListSiteOriginClientCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListSiteOriginClientCertificatesResponse self = new ListSiteOriginClientCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListSiteOriginClientCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListSiteOriginClientCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListSiteOriginClientCertificatesResponse setBody(ListSiteOriginClientCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListSiteOriginClientCertificatesResponseBody getBody() {
        return this.body;
    }

}
