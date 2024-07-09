// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateCustomCertificateResponseBody extends TeaModel {
    /**
     * <p>The content of the certificate. This parameter is returned only if Immediately is set to 1 or 2.</p>
     * 
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
     * <p>The certificate chain of the certificate. This parameter is returned only if Immediately is set to 2.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIBfzCCATGgAwIBAgIUfI5kSdcO2S0+LkpdL3b2VUJG10YwBQYDK2VwMDUxCzAJ
     * ...
     * ...
     * ...
     * ZYYG
     * -----END CERTIFICATE-----
     * -----BEGIN CERTIFICATE-----
     * MIIBczCCARgCAQAwgYoxFDASBgNVBAMMC2FsaXl1bi50ZXN0MQ0wCwYDVQQ
     * ...
     * ...
     * ...
     * KL5cUmF
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The unique identifier of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345678-1234-1234-1234-123456789ABC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the certificate. This parameter is returned only if Immediately is set to 1 or 2.</p>
     * 
     * <strong>example:</strong>
     * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    public static CreateCustomCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateCustomCertificateResponseBody self = new CreateCustomCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateCustomCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public CreateCustomCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateCustomCertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateCustomCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateCustomCertificateResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

}
