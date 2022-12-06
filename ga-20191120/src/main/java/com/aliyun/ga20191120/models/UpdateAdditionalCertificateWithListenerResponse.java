// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class UpdateAdditionalCertificateWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateAdditionalCertificateWithListenerResponseBody body;

    public static UpdateAdditionalCertificateWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateAdditionalCertificateWithListenerResponse self = new UpdateAdditionalCertificateWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public UpdateAdditionalCertificateWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateAdditionalCertificateWithListenerResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateAdditionalCertificateWithListenerResponse setBody(UpdateAdditionalCertificateWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateAdditionalCertificateWithListenerResponseBody getBody() {
        return this.body;
    }

}
