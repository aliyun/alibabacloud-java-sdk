// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateServerCertificateWithCsrResponseBody extends TeaModel {
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
     * <p>180ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>55C66C7B-671A-4297-9187-2C4477247A74</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the server certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>084bde9cd233f0ddae33adc438cfbbbd****</p>
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

    public static CreateServerCertificateWithCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServerCertificateWithCsrResponseBody self = new CreateServerCertificateWithCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServerCertificateWithCsrResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateServerCertificateWithCsrResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateServerCertificateWithCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServerCertificateWithCsrResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public CreateServerCertificateWithCsrResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
