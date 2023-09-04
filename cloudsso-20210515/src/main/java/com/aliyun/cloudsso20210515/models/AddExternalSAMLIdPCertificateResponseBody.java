// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudsso20210515.models;

import com.aliyun.tea.*;

public class AddExternalSAMLIdPCertificateResponseBody extends TeaModel {
    /**
     * <p>The ID of the SAML signing certificate.</p>
     */
    @NameInMap("CertificateId")
    public String certificateId;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static AddExternalSAMLIdPCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddExternalSAMLIdPCertificateResponseBody self = new AddExternalSAMLIdPCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public AddExternalSAMLIdPCertificateResponseBody setCertificateId(String certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public String getCertificateId() {
        return this.certificateId;
    }

    public AddExternalSAMLIdPCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
