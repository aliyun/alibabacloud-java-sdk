// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateSubCACertificateResponseBody extends TeaModel {
    @NameInMap("Certificate")
    public String certificate;

    @NameInMap("CertificateChain")
    public String certificateChain;

    @NameInMap("Identifier")
    public String identifier;

    @NameInMap("RequestId")
    public String requestId;

    public static CreateSubCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSubCACertificateResponseBody self = new CreateSubCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSubCACertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateSubCACertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateSubCACertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateSubCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
