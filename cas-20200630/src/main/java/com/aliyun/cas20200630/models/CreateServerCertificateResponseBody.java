// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateResponseBody extends TeaModel {
    /**
     * <p>The certificate chain of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The unique identifier of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>160ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>0f29522da2dae7a1c4b6ab7132ad3c06</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The content of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static CreateServerCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateResponseBody self = new CreateServerCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateServerCertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateServerCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServerCertificateResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public CreateServerCertificateResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
