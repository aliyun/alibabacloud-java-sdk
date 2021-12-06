// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class ListExternalSAMLIdPCertificatesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ListExternalSAMLIdPCertificatesResponse setBody(ListExternalSAMLIdPCertificatesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListExternalSAMLIdPCertificatesResponseBody getBody() {
        return this.body;
    }

}
