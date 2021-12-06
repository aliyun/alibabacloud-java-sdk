// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class RemoveExternalSAMLIdPCertificateResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public RemoveExternalSAMLIdPCertificateResponseBody body;

    public static RemoveExternalSAMLIdPCertificateResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveExternalSAMLIdPCertificateResponse self = new RemoveExternalSAMLIdPCertificateResponse();
        return TeaModel.build(map, self);
    }

    public RemoveExternalSAMLIdPCertificateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveExternalSAMLIdPCertificateResponse setBody(RemoveExternalSAMLIdPCertificateResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveExternalSAMLIdPCertificateResponseBody getBody() {
        return this.body;
    }

}
