// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200619.models;

import com.aliyun.tea.*;

public class UploadSSLCertificateResponseBody extends TeaModel {
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("RequestId")
    public String requestId;

    public static UploadSSLCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UploadSSLCertificateResponseBody self = new UploadSSLCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public UploadSSLCertificateResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public UploadSSLCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
