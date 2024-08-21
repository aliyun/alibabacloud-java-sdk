// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateWHClientCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----\n</p>
     */
    @NameInMap("CertificateChain")
    public String certificateChain;

    /**
     * <strong>example:</strong>
     * <p>190ae6bb538d538c70c01f81dcf2****</p>
     */
    @NameInMap("Identifier")
    public String identifier;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("ParentX509Certificate")
    public String parentX509Certificate;

    /**
     * <strong>example:</strong>
     * <p>8C467B38-3910-447D-87BC-AC049166F216</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("RootX509Certificate")
    public String rootX509Certificate;

    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----\n......\n-----END CERTIFICATE-----</p>
     */
    @NameInMap("X509Certificate")
    public String x509Certificate;

    public static CreateWHClientCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWHClientCertificateResponseBody self = new CreateWHClientCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWHClientCertificateResponseBody setCertificateChain(String certificateChain) {
        this.certificateChain = certificateChain;
        return this;
    }
    public String getCertificateChain() {
        return this.certificateChain;
    }

    public CreateWHClientCertificateResponseBody setIdentifier(String identifier) {
        this.identifier = identifier;
        return this;
    }
    public String getIdentifier() {
        return this.identifier;
    }

    public CreateWHClientCertificateResponseBody setParentX509Certificate(String parentX509Certificate) {
        this.parentX509Certificate = parentX509Certificate;
        return this;
    }
    public String getParentX509Certificate() {
        return this.parentX509Certificate;
    }

    public CreateWHClientCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWHClientCertificateResponseBody setRootX509Certificate(String rootX509Certificate) {
        this.rootX509Certificate = rootX509Certificate;
        return this;
    }
    public String getRootX509Certificate() {
        return this.rootX509Certificate;
    }

    public CreateWHClientCertificateResponseBody setX509Certificate(String x509Certificate) {
        this.x509Certificate = x509Certificate;
        return this;
    }
    public String getX509Certificate() {
        return this.x509Certificate;
    }

}
