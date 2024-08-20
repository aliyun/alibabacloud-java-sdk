// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class CreateDcdnCertificateSigningRequestResponseBody extends TeaModel {
    /**
     * <p>The Common Name of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <p>The content of the CSR file.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE REQUEST-----\nMIIC/zCCAecCAQAwZTELMAkGA1UEBhMCQ04xCzAJBgNVBAgTAlpKMQswCQYDVQQH</p>
     */
    @NameInMap("Csr")
    public String csr;

    /**
     * <p>The MD5 hash value of the certificate public key.</p>
     * 
     * <strong>example:</strong>
     * <p>629bf4fd8104eda171135bcb0f77a10b</p>
     */
    @NameInMap("PubMd5")
    public String pubMd5;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateDcdnCertificateSigningRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDcdnCertificateSigningRequestResponseBody self = new CreateDcdnCertificateSigningRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDcdnCertificateSigningRequestResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public CreateDcdnCertificateSigningRequestResponseBody setCsr(String csr) {
        this.csr = csr;
        return this;
    }
    public String getCsr() {
        return this.csr;
    }

    public CreateDcdnCertificateSigningRequestResponseBody setPubMd5(String pubMd5) {
        this.pubMd5 = pubMd5;
        return this;
    }
    public String getPubMd5() {
        return this.pubMd5;
    }

    public CreateDcdnCertificateSigningRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
