// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateRootCACertificateResponseBody extends TeaModel {
    /**
     * <p>The name of the city in which the organization is located. The value can contain letters.</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>RSA_2048</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The unique identifier of the root CA certificate.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>Zhejiang</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateRootCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateRootCACertificateResponseBody self = new CreateRootCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateRootCACertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateRootCACertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateRootCACertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateRootCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
