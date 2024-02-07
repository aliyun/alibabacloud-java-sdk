// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListExternalSAMLIdPCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListExternalSAMLIdPCertificatesResponseBody body;

    public static ListExternalSAMLIdPCertificatesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListExternalSAMLIdPCertificatesResponse self = new ListExternalSAMLIdPCertificatesResponse();
        return TeaModel.build(map, self);
    }

    public ListExternalSAMLIdPCertificatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListExternalSAMLIdPCertificatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListExternalSAMLIdPCertificatesResponse setBody(ListExternalSAMLIdPCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalSAMLIdPCertificatesResponseBody getBody() {
        return this.body;
    }

}
