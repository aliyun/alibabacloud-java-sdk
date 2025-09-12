// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateExternalCACertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIEkjCCA3qgAwIBAgIQCgFBQgAAAVOFc2oLheynCDANBgkqhkiG9w0BAQsFADA/
     * ...
     * ...
     * ...
     * KOqkqm57TH2H3eDJAkSnh6/DNFu0Qg==
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * ...
     * ...
     * -----END CERTIFICATE-----
     * -----BEGIN CERTIFICATE-----
     * ...
     * ...
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <strong>example:</strong>
     * <p>1ed4068c-6f1b-6deb-8e32-3f8439a851cb</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExternalCACertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExternalCACertificateResponseBody self = new CreateExternalCACertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExternalCACertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateExternalCACertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateExternalCACertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateExternalCACertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
