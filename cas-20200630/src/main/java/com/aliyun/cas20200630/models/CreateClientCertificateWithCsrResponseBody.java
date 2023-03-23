// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200630.models;

import com.aliyun.tea.*;

public class CreateClientCertificateWithCsrResponseBody extends TeaModel {
    /**
     * <p>The certificate chain of the client certificate.</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <p>The unique identifier of the client certificate.</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The serial number of the server certificate.</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The content of the client certificate.</p>
     */
    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static CreateClientCertificateWithCsrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateClientCertificateWithCsrResponseBody self = new CreateClientCertificateWithCsrResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateClientCertificateWithCsrResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateClientCertificateWithCsrResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateClientCertificateWithCsrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateClientCertificateWithCsrResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public CreateClientCertificateWithCsrResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
