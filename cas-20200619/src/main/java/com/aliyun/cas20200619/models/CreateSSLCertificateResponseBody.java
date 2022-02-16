// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class CreateSSLCertificateResponseBody extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSSLCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSSLCertificateResponseBody self = new CreateSSLCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSSLCertificateResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public CreateSSLCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
