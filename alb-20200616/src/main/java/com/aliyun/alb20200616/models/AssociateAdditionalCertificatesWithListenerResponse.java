// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class AssociateAdditionalCertificatesWithListenerResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public AssociateAdditionalCertificatesWithListenerResponseBody body;

    public static AssociateAdditionalCertificatesWithListenerResponse build(java.util.Map<String, ?> map) throws Exception {
        AssociateAdditionalCertificatesWithListenerResponse self = new AssociateAdditionalCertificatesWithListenerResponse();
        return TeaModel.build(map, self);
    }

    public AssociateAdditionalCertificatesWithListenerResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AssociateAdditionalCertificatesWithListenerResponse setBody(AssociateAdditionalCertificatesWithListenerResponseBody body) {
        this.body = body;
        return this;
    }
    public AssociateAdditionalCertificatesWithListenerResponseBody getBody() {
        return this.body;
    }

}
