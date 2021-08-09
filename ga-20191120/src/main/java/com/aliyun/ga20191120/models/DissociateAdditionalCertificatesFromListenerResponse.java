// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DissociateAdditionalCertificatesFromListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DissociateAdditionalCertificatesFromListenerResponseBody body;

    public static DissociateAdditionalCertificatesFromListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        DissociateAdditionalCertificatesFromListenerResponse self = new DissociateAdditionalCertificatesFromListenerResponse();
        return TeaModel.build(map, self);
    }

    public DissociateAdditionalCertificatesFromListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DissociateAdditionalCertificatesFromListenerResponse setBody(DissociateAdditionalCertificatesFromListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public DissociateAdditionalCertificatesFromListenerResponseBody getBody() {
        return this.body;
    }

}
